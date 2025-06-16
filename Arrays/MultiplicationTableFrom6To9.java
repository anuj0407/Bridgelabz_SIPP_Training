import java.util.Scanner;
class MultiplicationTableFrom6To9{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the Number: ");
int number = input.nextInt();
int [] multiplicationArray = new int[4]; 
for(int i=6 ;i<=9 ;i++){
multiplicationArray[i-6] = number * i ;
}
//Displaying multiplication of table
for(int i=0; i<=4 ; i++){
System.out.println(number + " * " + (i+6) + " = " + multiplicationArray[i]);
}
}
}