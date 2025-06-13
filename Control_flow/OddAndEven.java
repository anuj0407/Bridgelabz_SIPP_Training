import java.util.Scanner;
class OddAndEven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number : ");
int number = input.nextInt();
if(number >= 1){
for(int i=1; i<=number ;i++){
if(i % 2 == 0){
System.out.println(i + " is a even number.");
}
else{
System.out.println(i + " is a odd number.");
}
}

}
}
}