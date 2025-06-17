import java.util.Scanner;
class RemainderAndQuotient{
public static int[] findRemainderAndQuotient(int number ,int divisor){
int [] remainderAndQuotient = new int[2];
remainderAndQuotient[0] = number / divisor;
remainderAndQuotient[1] = number % divisor;
return remainderAndQuotient;
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter a number : ");
int number = input.nextInt();
System.out.print("Enter a divisor : ");
int divisor = input.nextInt();
int [] result = findRemainderAndQuotient (number, divisor);
System.out.println("Quotient : " + result[0] + " , Remainder " + result[1]);

}
}