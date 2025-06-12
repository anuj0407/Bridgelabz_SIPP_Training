import java.util.Scanner;
class FindSide{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int perimeter = input.nextInt();
double side = perimeter / 4.0;
System.out.println("The length of the side is " + side + " whose perimeter is  " + perimeter);
}
}
