package workshop;

import java.util.*;
import java.util.stream.*;
import java.time.*;

class Item {
    String name;
    String category;
    double price;

    public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price;
    }
}

class Order {
    LocalDate date;
    List<Item> items;

    public Order(LocalDate date, List<Item> items) {
        this.date = date;
        this.items = items;
    }
    public LocalDate getDate() { return date; }
    public List<Item> getItems() { return items; }
}

public class SalesDashboard {
    public static void main(String[] args) {
        Map<String, Map<String, Map<String, List<Order>>>> cityToStoresMap = new HashMap<>();

        Item tv = new Item("Smart TV", "Electronics", 800);
        Item phone = new Item("Phone", "Electronics", 600);
        Item blender = new Item("Blender", "Home Appliances", 150);
        Item treadmill = new Item("Treadmill", "Fitness", 450);
        Item book = new Item("Book", "Stationery", 20);

        Order o1 = new Order(LocalDate.now().minusDays(10), Arrays.asList(tv, phone));
        Order o2 = new Order(LocalDate.now().minusDays(20), Arrays.asList(blender, book));
        Order o3 = new Order(LocalDate.now().minusDays(30), Arrays.asList(treadmill));

        Map<String, List<Order>> customerOrders = new HashMap<>();
        customerOrders.put("Alice", Arrays.asList(o1, o2, o3));

        Map<String, Map<String, List<Order>>> stores = new HashMap<>();
        stores.put("Store1", customerOrders);

        cityToStoresMap.put("New York", stores);

        LocalDate cutoff = LocalDate.now().minusDays(60);

        Stream<Item> filteredItemsStream = cityToStoresMap.values().stream() 
            .flatMap(storeMap -> storeMap.values().stream()) 
            .flatMap(customerMap -> customerMap.entrySet().stream()
                .filter(e -> e.getValue().stream()
                        .filter(order -> order.getDate().isAfter(cutoff)) 
                        .count() >= 3) 
                .map(e -> e.getValue()) 
            )
            .flatMap(List::stream) 
            .flatMap(order -> order.getItems().stream()); 

        List<Item> topAffordablePicks = filteredItemsStream
            .distinct() 
            .sorted(Comparator.comparingDouble(Item::getPrice).reversed()) 
            .peek(item -> System.out.println("Logging: " + item.getName() + " $" + item.getPrice()))
            .skip(2) 
            .limit(10) 
            .collect(Collectors.toList());

        Map<String, List<Item>> groupedByCategory =
            topAffordablePicks.stream().collect(Collectors.groupingBy(Item::getCategory));

        long electronicsCount = groupedByCategory.getOrDefault("Electronics", Collections.emptyList()).size();

        boolean hasExpensiveOver500 = topAffordablePicks.stream().anyMatch(i -> i.getPrice() > 500);
        boolean allAbove10 = topAffordablePicks.stream().allMatch(i -> i.getPrice() > 10);
        boolean noneEmptyName = topAffordablePicks.stream().noneMatch(i -> i.getName() == null || i.getName().isEmpty());

        Optional<Item> firstHomeAppliance =
            groupedByCategory.getOrDefault("Home Appliances", Collections.emptyList()).stream().findFirst();

        Optional<Item> anyFitness =
            groupedByCategory.getOrDefault("Fitness", Collections.emptyList()).stream().findAny();

        double totalValue = topAffordablePicks.stream()
            .map(Item::getPrice)
            .reduce(0.0, Double::sum);

        System.out.println("\n=== Top Affordable Picks ===");
        topAffordablePicks.forEach(System.out::println);

        System.out.println("\nGrouped By Category: " + groupedByCategory);
        System.out.println("Electronics Count: " + electronicsCount);
        System.out.println("Any item > $500? " + hasExpensiveOver500);
        System.out.println("All items > $10? " + allAbove10);
        System.out.println("None empty names? " + noneEmptyName);
        System.out.println("First Home Appliance: " + firstHomeAppliance.orElse(null));
        System.out.println("Any Fitness Item: " + anyFitness.orElse(null));
        System.out.println("Total Value: $" + totalValue);
    }
}

