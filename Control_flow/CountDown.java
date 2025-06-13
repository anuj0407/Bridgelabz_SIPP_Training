import java.util.Scanner;
class CountDown{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Value for countdown : ");
int counter = input.nextInt();
for(int i = counter ; i > 0 ; i--){
System.out.println(i);
}
}
}