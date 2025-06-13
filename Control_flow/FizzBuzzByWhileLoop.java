import java.util.Scanner;
class FizzBuzzByWhileLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
int temp = 1;
if(number <= 0){
System.out.println("Invalid number");
}
else{
while(temp <= number){

if(temp % 3 == 0){
if(temp % 5 == 0){
System.out.println("FizzBuzz");
}
else{
System.out.println("Fizz");
}
}
else if(temp % 5 == 0){
System.out.println("Buzz");
}
else{
System.out.println(temp);
}
temp++;
}

}

}
}