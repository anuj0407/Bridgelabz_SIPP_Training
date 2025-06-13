import java.util.Scanner;
class CompareSumOfNaturalNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
if(number >= 0){
int sumByFormulae = (number *(number + 1 )) / 2;
int sumByForLoop = 0;
for(int i = 1 ; i <= number ; i++){
sumByForLoop += i;
}
if(sumByFormulae == sumByForLoop) {
System.out.println("The sum of " + number + " natural numbers is " + sumByFormulae + " Comparision of formulae and for loop gives true");
}
}
else{
System.out.println("The number " + number + " is not a natural number ");
}
}
}