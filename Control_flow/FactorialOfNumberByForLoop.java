import java.util.Scanner;
class FactorialOfNumberByForLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number for factorial : ");
int number = input.nextInt();
int factorial = 1;
if(number <= 0 ){
System.out.println("Invalid or Negative number");
}
else{
for(int i = number; i > 0 ;i--){
factorial *= i;
}
System.out.println("The factorial of number " + number + " is " + factorial + " by for loop ");
}
}
}