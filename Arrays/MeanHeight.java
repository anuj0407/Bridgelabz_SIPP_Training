import java.util.Scanner;
class MeanHeight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double [] heights = new double[11];
System.out.println("Height of players: ");
double sum = 0;
for(int i=0; i<11 ;i++){
heights[i] = input.nextDouble();
sum += heights[i]; 
}

double mean = sum / 11.0;
System.out.println("Mean height of players in a Football team : " + mean);
}
}