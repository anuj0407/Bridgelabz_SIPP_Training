import java.util.Scanner;
class HeightConversion{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
float heightInCm = input.nextFloat();
double heightInInches = heightInCm / 2.54;
double heightInFoot = heightInInches / 12.0;
System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFoot + " and inches is " + heightInInches);
}
}