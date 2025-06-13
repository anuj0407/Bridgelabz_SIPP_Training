import java.util.Scanner;
class CompareSumOfNaturalNumberWithWhile{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
if(number >= 0){
int sumByFormulae = (number *(number + 1 )) / 2;
int sumByWhileLoop = 0;
int temp = number;
while(temp > 0){
sumByWhileLoop += temp;
temp--;
}
if(sumByFormulae == sumByWhileLoop) {
System.out.println("The sum of " + number + " natural numbers is " + sumByFormulae + " and Comparision of formulae and while loop gives true");
}

else{
System.out.println("The number " + number + " is not a natural number ");
}
}
}
}