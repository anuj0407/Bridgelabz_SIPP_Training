package sortingProblem;

public class ExamScores {

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	} 
	
	public static void displayArrayElements(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] scores = {50,45,29,65,14};
		System.out.println("Before Selection sort:-");
		displayArrayElements(scores);
		selectionSort(scores);
		System.out.println("After Selection sort:-");
		displayArrayElements(scores);
	}
	
}
