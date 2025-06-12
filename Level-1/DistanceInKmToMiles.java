import java.util.Scanner;
class DistanceInKmToMiles{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double km = input.nextInt();
double mile = km * 0.621371;
System.out.println("The total miles is " + mile + " mile for the given " + km +" km");
}
}