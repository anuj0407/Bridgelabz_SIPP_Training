import java.util.Scanner;
class Rounds{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Side 1 of Triangular Park: ");
int side1InM = input.nextInt();
System.out.print("Side 2 of Triangular Park: ");
int side2InM = input.nextInt();
System.out.print("Side 3 of Triangular Park: ");
int side3InM = input.nextInt();
float distanceInKm = 5;
double round = (distanceInKm * 1000) / (side1InM + side2InM + side3InM);
System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
}
}
