import java.util.Scanner;
class TempConversion{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Temperature in Fahrenheit : ");
float fahrenheit = input.nextFloat();
double celsius = (fahrenheit -32)* 5/(double)9;
System.out.print("The " + fahrenheit + " fahrenheit is " + celsius +" celsius");
}
}