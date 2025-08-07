package regex;
import java.util.regex.*;

public class ValidateUserName {

	public static void main(String[] args) {
		 String regex = "^[a-zA-Z]+[a-zA-Z0-9_]{5,15}$";
	        Pattern pattern = Pattern.compile(regex);
	        String input = "Anuj_723";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }


	}

}