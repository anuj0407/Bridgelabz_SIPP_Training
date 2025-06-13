import java.util.Scanner;
class YoungestAndTallest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter age of Amar : ");
int amarAge = input.nextInt();
System.out.print("Enter height of Amar : ");
int amarHeight = input.nextInt();
System.out.print("Enter age of Akbar : ");
int akbarAge = input.nextInt();
System.out.print("Enter height of Akbar : ");
int akbarHeight = input.nextInt();
System.out.print("Enter age of Anthony : ");
int anthonyAge = input.nextInt();
System.out.print("Enter height of Anthony : ");
int anthonyHeight = input.nextInt();
if(amarAge < akbarAge && amarAge < anthonyAge){
System.out.println("The youngest among 3 friends is Amar." );
}
else if(akbarAge < amarAge && akbarAge < anthonyAge){
System.out.println("The youngest among 3 friends is Akbar." );
}
else{
System.out.println("The youngest among 3 friends is Anthony." );
}

if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
System.out.println("The tallest among 3 friends is Amar.");
}
else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
System.out.println("The tallest among 3 friends is Akbar.");
}
else{
System.out.println("The tallest among 3 friends is Anthony.");
}

}
}