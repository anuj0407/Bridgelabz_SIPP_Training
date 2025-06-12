import java.util.Scanner;
class DistanceConversion{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
float distanceInFeet = input.nextFloat();
double distanceInYards = distanceInFeet / 3.0;
double distanceInMiles = distanceInYards / 1760.0;
System.out.println("Distance in yards is " + distanceInYards + " distance in miles is " + distanceInMiles + " for distance in feet " + distanceInFeet);
}
}