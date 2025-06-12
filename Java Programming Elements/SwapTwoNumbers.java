import java.util.Scanner;
class SwapTwoNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number1 : ");
int number1 = input.nextInt();
System.out.print("Number2 : ");
int number2 = input.nextInt();
number1 = number1 + number2;
number2 = number1 - number2;
number1 = number1 - number2;
System.out.println("Swapped Number1 is " + number1 + " and Number2 is " + number2 ); 
}
}