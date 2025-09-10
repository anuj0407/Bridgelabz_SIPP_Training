package workshop;

import java.lang.annotation.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Trackable {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ImportantCustomer {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DiscountApplicable {
    int minOrders();
    double minValue();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CategoryInfo {
    String name();
    String description();
}

@ImportantCustomer
@DiscountApplicable(minOrders=5, minValue=2000)
class Customer {
    String name;
    List<Order> orders;
    Customer(String n, List<Order> o) { name=n; orders=o; }
    String getName() { return name; }
    List<Order> getOrders() { return orders; }
}

class ReflectionUtil {
    static void scanTrackables(Class<?>... classes) {
        Arrays.stream(classes).forEach(c -> {
            if(c.isAnnotationPresent(Trackable.class)) {
                System.out.println("Trackable class: " + c.getSimpleName());
            }
        });
    }

    static void showCategoryInfo(Class<?> clazz) {
        if(clazz.isAnnotationPresent(CategoryInfo.class)) {
            CategoryInfo ci = clazz.getAnnotation(CategoryInfo.class);
            System.out.println("Category: " + ci.name() + " - " + ci.description());
        }
    }

    static boolean qualifiesForDiscount(Customer c) {
        DiscountApplicable d = c.getClass().getAnnotation(DiscountApplicable.class);
        if(d==null) return false;
        long orderCount = c.getOrders().size();
        double totalValue = c.getOrders().stream()
                .flatMap(o -> o.getItems().stream())
                .mapToDouble(Item::getPrice).sum();
        return orderCount>=d.minOrders() && totalValue>=d.minValue();
    }

    static boolean isVIP(Customer c) {
        return c.getClass().isAnnotationPresent(ImportantCustomer.class);
    }
}

public class SalesDashBoardAnnotation{
    public static void main(String[] args) {
        Item tv = new Item("Smart TV","Electronics",800);
        Item phone = new Item("Phone","Electronics",600);
        Item blender = new Item("Blender","Home Appliances",150);
        Item treadmill = new Item("Treadmill","Fitness",450);
        Item book = new Item("Book","Stationery",20);

        Order o1 = new Order(LocalDate.now().minusDays(10), Arrays.asList(tv, phone));
        Order o2 = new Order(LocalDate.now().minusDays(20), Arrays.asList(blender, book));
        Order o3 = new Order(LocalDate.now().minusDays(30), Arrays.asList(treadmill));

        Customer alice = new Customer("Alice", Arrays.asList(o1, o2, o3));

        Map<String, Map<String, Map<Customer, List<Order>>>> cityToStoresMap = new HashMap<>();
        cityToStoresMap.put("New York", Map.of("Store1", Map.of(alice, alice.getOrders())));

        System.out.println("\n--- Reflection Scans ---");
        ReflectionUtil.scanTrackables(Item.class, Order.class, Customer.class);
        ReflectionUtil.showCategoryInfo(Item.class);

        LocalDate cutoff = LocalDate.now().minusDays(60);

        List<Item> picks = cityToStoresMap.values().stream()
            .flatMap(storeMap -> storeMap.values().stream())
            .flatMap(customerMap -> customerMap.entrySet().stream()
                .filter(e -> e.getValue().stream().filter(o -> o.getDate().isAfter(cutoff)).count()>=3)
                .map(Map.Entry::getValue))
            .flatMap(List::stream).flatMap(o -> o.getItems().stream())
            .distinct().sorted(Comparator.comparingDouble(Item::getPrice).reversed())
            .peek(i -> System.out.println("Logging: " + i.getName()+" $"+i.getPrice()))
            .skip(2).limit(10).collect(Collectors.toList());

        System.out.println("\n--- Dashboard ---");
        if(ReflectionUtil.isVIP(alice)) System.out.println("VIP Customer: " + alice.getName());
        if(ReflectionUtil.qualifiesForDiscount(alice)) System.out.println(alice.getName()+" qualifies for discount!");

        picks.forEach(System.out::println);
    }
}
