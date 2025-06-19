import java.util.*;
class SubStringUsingCharAt{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the value of String  : ");  
		String str = input.next();
		System.out.print("Enter the start and ending value of substring: ");
		int start =input.nextInt();
		int end = input.nextInt();
		String strCharAt = substring(str, start, end);
		// compare sub string
		System.out.println("compare both sub string: " );
		display(str,strCharAt, start, end);
	}
	public static String substring(String str, int start, int end){
		 String newStr = "";
		for(int i=start;i<end;i++){
			newStr+=str.charAt(i);
		}
		return newStr;
	}
	public static void display (String str, String newStr, int  start , int end){	
		str = str.substring(start,end);
		System.out.println( "Both subString output  using charAt is " + newStr + " and using substring() method is " + str);
		if(str.equals(newStr)){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
	}
}