import java.util.Scanner;
class TemperatureConversion{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Temperature in Celsius: ");
float celsius = input.nextFloat();
double fahrenheit = (celsius * 9 / 5.0) + 32;
System.out.print("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
}
}