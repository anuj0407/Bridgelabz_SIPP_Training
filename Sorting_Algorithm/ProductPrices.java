package sortingProblem;
import java.util.Arrays;

public class ProductPrices {

	
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	public static int partition(int[] arr,int low,int high) {
		int pivot =arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void main(String[] args) {
		int arr[] = {1,4,3,8,5,9,3,6};
		System.out.println("Array before sorting:-");
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("Array after sorting:-");
		System.out.println(Arrays.toString(arr));

	}

}