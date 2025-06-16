import java.util.Scanner;
class MultiplicationTable{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the Number: ");
int number = input.nextInt();
int [] multiplicationArray = new int[10]; 
for(int i=1 ;i<=10 ;i++){
multiplicationArray[i-1] = number * i ;
}
//Displaying multiplication of table
for(int i=0; i<multiplicationArray.length ; i++){
System.out.println(number + " * " + (i+1) + " = " + multiplicationArray[i]);
}
}
}