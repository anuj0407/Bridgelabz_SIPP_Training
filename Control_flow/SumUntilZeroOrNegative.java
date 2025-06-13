import java.util.Scanner;
class SumUntilZeroOrNegative{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double total = 0.0;
System.out.print("Input number : ");
double userInput = input.nextDouble();
while(userInput > 0){

total += userInput;
System.out.print("Input number : ");
userInput = input.nextDouble();
}
System.out.println("Total value is " + total);
}
}