import java.util.Scanner;
class FactorsByForLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();

if(number <= 0){
System.out.println("Invalid Integer");
}

else{
for(int i=1; i<number ;i++){
if(number % i == 0){
System.out.println(i + " is a factor of the number " + number );
}
}

}
}
}