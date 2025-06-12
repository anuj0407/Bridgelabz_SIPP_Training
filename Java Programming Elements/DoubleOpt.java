import java.util.Scanner;
class DoubleOpt{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();
double operation1 = a + b * c;
double operation2 = a * b + c;
double operation3 = c + a / b;
double operation4 = a % b * c;
System.out.println("The results of Operations are " + operation1 + " , " + operation2 + " , " + operation3 + " ,and " + operation4);
}
}