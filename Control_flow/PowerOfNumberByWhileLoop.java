import java.util.Scanner;
class PowerOfNumberByWhileLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number : ");
int number = input.nextInt();
System.out.print("Enter the power : ");
int power = input.nextInt();
int result = 1;
int counter = 0;
while(counter!=power){
result *= number;
counter++;
}
System.out.println(number + "^" + power + " = " + result);
}
}