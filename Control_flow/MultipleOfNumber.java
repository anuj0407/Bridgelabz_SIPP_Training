import java.util.Scanner;
class MultipleOfNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
int counter = number - 1;
if(number >= 100 && number < 0){
	System.out.println("Invalid Number");
}
else{
	while(counter > 1){
		if(number % counter == 0){
			System.out.println(counter + " is a multiple of " + number);
		}
		counter--;
	}
}

}
}