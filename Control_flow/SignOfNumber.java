import java.util.Scanner;
class SignOfNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
if(number > 0){
System.out.print("Positive");
}
else if(number == 0){
System.out.print("Zero");
}
else{
System.out.print("Negative");
}
}
}