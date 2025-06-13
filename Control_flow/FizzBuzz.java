import java.util.Scanner;
class FizzBuzz{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
if(number <= 0){
System.out.println("Invalid number");
}
else{
for(int i = 1; i<=number ;i++){

if(i % 3 == 0){
if(i % 5 == 0){
System.out.println("FizzBuzz");
}
else{
System.out.println("Fizz");
}
}
else if(i % 5 == 0){
System.out.println("Buzz");
}
else{
System.out.println(i);
}

}

}

}
}