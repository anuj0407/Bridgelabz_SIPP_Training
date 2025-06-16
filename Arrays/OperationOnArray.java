import java.util.Scanner;
class OperationOnArray{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int [] array = new int[5];
System.out.println("Enter Numbers in array :");
for(int i=0; i<5 ;i++){
array[i] = input.nextInt();
}
for(int i=0; i<array.length ;i++){
if(array[i] > 0){
if(array[i] % 2 == 0){
System.out.println(array[i] + " is a positive and even number");
}
else{
System.out.println(array[i] + " is a positive and odd number");
}
}
else if(array[i] == 0){
System.out.println(array[i] + "is a zero ");
}
else{
System.out.println(array[i] + "is a negative number ");
}
}
if(array[0] == array[4]){
System.out.println("First and Last element of array are equal ");
}
else if(array[0] > array[4]){
System.out.println("First element is greater then Last element of array ");
}
else{
System.out.println("First element is Smaller then Last element of array ");
}
}
}