import java.util.Scanner;
class TotalIncome{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Salary of person: ");
int salary = input.nextInt();
System.out.print("Bonus of person: ");
int bonus = input.nextInt();
int income = salary + bonus;
System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + income);
}
}