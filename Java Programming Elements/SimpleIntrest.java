import java.util.Scanner;
class SimpleIntrest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Principal: ");
int principal = input.nextInt();
System.out.print("Rate: ");
float rate = input.nextFloat();
System.out.print("Time in years: ");
float time = input.nextFloat();

double simpleIntrest = (principal * rate * time) / 100.0;
System.out.println("The Simple Interest is " + simpleIntrest + " for Principal " + principal + " , Rate of Interest " + rate + " and Time " + time);
}
}