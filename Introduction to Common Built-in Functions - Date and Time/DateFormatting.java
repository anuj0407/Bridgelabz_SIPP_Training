
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;

public class DateFormatting {
    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.print("Enter Date: (in dd-MM-yyyy) : ");
	String dateInput = input.next();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
LocalDate date = LocalDate.parse(dateInput,formatter);
	


DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
	System.out.println("Date in new format is : "+ date.format(formatter1));
	System.out.println("Date in new format is : "+ date.format(formatter2));
	System.out.println("Date in new format is : "+ date.format(formatter3));
	
	

            }
}