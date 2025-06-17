import java.util.Scanner;

public class FriendStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
	
	FriendStats age = new FriendStats();
	FriendStats height = new FriendStats();
	int minAgeIndex = age.minAge(ages);
	int maxHeightIndex =height.maxHeight(heights);




	        System.out.println("\nYoungest friend is: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
        System.out.println("Tallest friend is: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");
}

 public int minAge(int ages[]){
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
	return minAgeIndex;
}
public int maxHeight(double[] heights){

        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
	return maxHeightIndex;
}    
}