import java.util.Scanner;
class MultipleOfNumberByForLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number : ");
int number = input.nextInt();
if(number >= 100 && number < 0){
	System.out.println("Invalid Number");
}
else{
	for(int i=100; i >= 1;i--){
		if(number % i == 0){
			System.out.println(i + " is a multiple of " + number);
		}
	}
}

}
}