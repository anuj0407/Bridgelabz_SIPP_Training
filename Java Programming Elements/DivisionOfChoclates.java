import java.util.Scanner;
class DivisionOfChoclates{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Number of choclates : ");
int numberOfChoclates = input.nextInt();
System.out.print("Number of children : ");
int numberOfChildren = input.nextInt();
int equalChoclates = numberOfChoclates / numberOfChildren;
int remainingChoclates = numberOfChoclates % numberOfChildren;
System.out.println("The number of chocolates each child gets is " + equalChoclates + " and the number of remaining chocolates is " + remainingChoclates);

}
}