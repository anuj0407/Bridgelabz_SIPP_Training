import java.util.Scanner;
class LargestNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number1 : ");
int number1 = input.nextInt();
System.out.print("Number2 : ");
int number2 = input.nextInt();
System.out.print("Number3 : ");
int number3 = input.nextInt();
if(number1 > number2 && number1 > number3){
System.out.println("Is the first number the largest? true");
System.out.println("Is the second number the largest? false");
System.out.println("Is the third number the largest? false");
}
else if(number2 > number1 && number2 > number3){
System.out.println("Is the first number the largest? false");
System.out.println("Is the second number the largest? true");
System.out.println("Is the third number the largest? false");
}
else{
System.out.println("Is the first number the largest? false");
System.out.println("Is the second number the largest? false");
System.out.println("Is the third number the largest? true");
}
}
}