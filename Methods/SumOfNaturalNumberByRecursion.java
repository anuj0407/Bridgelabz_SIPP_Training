import java.util.Scanner;
class SumOfNaturalNumberByRecursion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a numbers : ");
		int number = input.nextInt();

		SumOfNaturalNumber sum =new SumOfNaturalNumber();
		int sumByComputation = sum.fun(number);
		int sumByRecursion = naturalNumberRecursion(number,1,0 );
System.out.println(sumByComputation);
System.out.println(sumByRecursion);
		if(sumByComputation == sumByRecursion){
		System.out.println("Sum are same by both formula and recursion and sum is " + sumByRecursion );
		}
else{
System.out.println("Invalid");
}
	}
public static int naturalNumberRecursion(int number,int start,int sum){
	if(number < start){
return sum;
}
sum += start;
	return naturalNumberRecursion(number,++start,sum);	
	}

	public int fun(int number){
		if(number>0){
			int sum=number*(number+1)/2;
			return sum;
		}
		else{
			System.out.println( "The number "+number+" is not a natural number");
			return 0;
		}
		
	}

	
}