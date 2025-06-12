import java.util.Scanner;
class TravellingComputation{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Name of traveller: ");
String name = input.nextLine();
System.out.print("From which city: ");
String fromCity = input.nextLine();
System.out.print("Via which city: ");
String viaCity = input.nextLine();
System.out.print("To which city: ");
String toCity = input.nextLine();

System.out.print("Distance from " + fromCity + " to " + viaCity +" in miles: ");
int fromToVia = input.nextInt();
System.out.print("Distance from " + viaCity + " to " + toCity +" in miles: ");
int viaToFinalCity = input.nextInt();
System.out.print("Time from " + fromCity + " to " + viaCity + " in minutes : ");
int timeFromToVia = input.nextInt();
System.out.print("Time from " + viaCity + " to " + toCity + " in minutes : ");
int timeViaToFinal = input.nextInt();
int totalDistance = fromToVia + viaToFinalCity;
int totalTimeTaken = timeFromToVia + timeViaToFinal;

System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTimeTaken + " minutes " );
}
}