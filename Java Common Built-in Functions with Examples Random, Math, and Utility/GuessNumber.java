import java.util.*;
public class GuessNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number by user (1-100) : ");
		int n = input.nextInt();
		int randomNumber= guesses();
		feedback(n,randomNumber);
		
		
	}
	public static int guesses(){
		int randomNumber = (int) (Math.random() * 100 ) +1;
		return randomNumber;
	}
	public static void feedback(int n, int randomNumber){
		if(randomNumber<n){
			System.out.println("generated number is " +randomNumber+" low  , guesses again");
			randomNumber= guesses();
			feedback(n,randomNumber);
		}
		else if(randomNumber>n){
			System.out.println("generated number is " +randomNumber+" high , guesses again");
			randomNumber= guesses();
			feedback(n,randomNumber);
		}
		else {
			System.out.println("generated number is " +randomNumber+" correct , guesses number and generated number is same , No need to guess again");
			return ;
		}
			
			
			
	}
}