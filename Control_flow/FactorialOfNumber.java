import java.util.Scanner;
class FactorialOfNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number for factorial : ");
int number = input.nextInt();
int temp = number;
int factorial = 1;
if(number <= 0 ){
System.out.println("Invalid or Negative number");
}
else{
while(temp > 0){
factorial *= temp;
temp--;
} 
System.out.println("The factorial of number " + number + " is " + factorial);
}

}
}