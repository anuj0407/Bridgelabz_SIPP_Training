import java.util.Scanner;
class FactorsByWhileLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
int counter = 1;
if(number <= 0){
System.out.println("Invalid Integer");
}

else{
while(counter<number){
if(number % counter == 0){
System.out.println(counter + " is a factor of the number " + number );
counter++;
}
}

}
}
}