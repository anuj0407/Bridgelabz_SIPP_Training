import java.util.Scanner;
class CountDownByWhile{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Value for countdown : ");
int counter = input.nextInt();
while(counter > 0){
System.out.println(counter);
counter--;
}
}
}