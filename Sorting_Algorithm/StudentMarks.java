package sortingProblem;
import java.util.Scanner;

public class StudentMarks {

	public static void bubbleSort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {

			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Student marks in ascending order:--");
		for(int i = 0;i<arr.length;i++) {
			if(i != arr.length-1) {
			System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]);
			}
		}
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of student:");
		int noOfStudents = input.nextInt();
		int[] studentMarks = new int[noOfStudents];
		for(int i =0;i<noOfStudents ;i++) {
			System.out.print("Enter no. of " +(i+1) +"th student marks:");
			studentMarks[i] = input.nextInt();
		}
		bubbleSort(studentMarks);
		input.close();

	}
}
