import java.util.Scanner;
class GreatestFactorOfNumberByWhileLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the Number : ");
int number = input.nextInt();
int greatestFactor = 1;
int counter = number-1;
while(counter>=1){
if(number % counter == 0){
greatestFactor = counter;
break;
}
counter--;
}

System.out.println("The greatest factor of " + number + " is " + greatestFactor);
}
}