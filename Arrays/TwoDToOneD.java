import java.util.Scanner;
class TwoDToOneD{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the rows : ");
int rows = input.nextInt();
System.out.print("Enter the columns : ");
int columns = input.nextInt();
int [][] array = new int[rows][columns];
System.out.println("Input elements of Array:");
for(int i = 0 ; i < rows; i++){
for(int j=0; j < columns ; j++){
array[i][j] = input.nextInt();
}
} 


int [] resultArray = new int[rows*columns];
int idx = 0;
for(int i = 0; i< rows ;i++){
for(int j=0 ; j < columns ;j++){
resultArray[idx] = array[i][j]; 
idx++;
}
}

System.out.println("All 2D array elements In 1D Array");
for(int i=0; i< resultArray.length ;i++){
System.out.print(resultArray[i] + " " );
}
}
}