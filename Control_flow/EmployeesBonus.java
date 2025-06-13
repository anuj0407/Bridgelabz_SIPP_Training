import java.util.Scanner;
class EmployeesBonus{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the salary of Employee : ");
int salary = input.nextInt(); 
System.out.print("Enter the year of services of Employee : ");
int yearOfService = input.nextInt();
if(yearOfService > 5){
double bonus = (salary * 5) / 100.0; 
System.out.println("The employee whose salary is INR " + salary + " and year of service are " + yearOfService + " have bonus of INR " + bonus);
}
}
}