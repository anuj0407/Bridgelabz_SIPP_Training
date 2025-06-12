import java.util.*;
class handshakes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int combination = (numberOfStudents * (numberOfStudents-1))/2;
		System.out.println("the number of possible handshakes " + combination);
		}
}