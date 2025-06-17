import java.util.*;
class Handshakes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int numberOfStudents = sc.nextInt();
		Handshakes obj = new Handshakes();
		obj.function(numberOfStudents);
		}
	public void function(int numberOfStudents){
		int combination = (numberOfStudents * (numberOfStudents-1))/2;
		System.out.println("the number of possible handshakes " + combination);
		}
}