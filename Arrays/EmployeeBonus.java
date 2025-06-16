import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oldSalary[] = new double[10];
        int year[] = new int[10];
	double newSalary[] = new double[10];
	double bonusArr[] = new double[10];
	double totalBonus=0, totalOldSalary=0, totalNewSalary=0;
	System.out.println("enter oldSalary of employees ");
	for(int i=0;i<10;i++){
		oldSalary[i]=input.nextDouble();
		newSalary[i]=oldSalary[i];
		totalOldSalary+=oldSalary[i];
	}
	System.out.println("enter year of service of employees ");
	for(int i=0;i<10;i++){
		year[i]=input.nextInt();
		
	}
	for(int i=0;i<10;i++){
	

        if (year[i] > 5) {
            double bonus = 0.05 * oldSalary[i];
	    bonusArr[i]=bonus;
	    newSalary[i] = newSalary[i]+bonus;
	   totalBonus+=bonus;
		totalNewSalary+=newSalary[i];
		
		
		
            
        } else {
            double bonus = 0.02 * oldSalary[i];
	    bonusArr[i]=bonus;
	    newSalary[i] = newSalary[i]+bonus;
		totalBonus+=bonus;
		totalNewSalary+=newSalary[i];
        }
	}
       System.out.println("Total Bouns " + totalBonus);
	System.out.println("Total old salary " + totalOldSalary);
	System.out.println("Total new salary " + totalNewSalary);
    }
}