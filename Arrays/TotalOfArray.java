import java.util.Scanner;
class TotalOfArray{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double [] array = new double[10];
double total = 0.0;
int idx = 0;
System.out.println("Enter Array Elements : ");
while(true){
if(idx > 10){
break;
}
double value = input.nextDouble();
if(value == 0 || value < 0){
break;
}

array[idx] = value;
idx++;
}

for(int i=0 ; i< array.length ;i++){
total += array[i];
}
System.out.println("Sum of All elements of Array is : " + total);

}
}