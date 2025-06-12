import java.util.Scanner;
class PoundsToKilogram{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Weight in pounds : ");
float weightInPounds = input.nextFloat();
double weightInKilogram = weightInPounds * 2.2;
System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKilogram);
}
}