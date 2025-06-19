import java.util.Scanner;

class PalindromeChecker{

static Scanner input = new Scanner(System.in);

static String inputString(){
System.out.print("Enter the string: ");
String str = input.nextLine();
return str;
}

static boolean checkPalindrome(String str){
String temp = str.toLowerCase();
int left = 0;
int right = temp.length()-1;
while(left < right){
if(temp.charAt(left) != temp.charAt(right)){
return false;
}
left++;
right--;
}
return true;
}

static void display(String str , boolean isPalindrome){
if(isPalindrome){
System.out.println(str + " is a palindrome");
}
else{
System.out.println(str + " is not a palindrome");
}
}

public static void main(String[] args){
String str = inputString();
boolean flag = checkPalindrome(str);
display(str, flag);
}

}