import java.util.Scanner;
class VoteEligibility{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int [] age = new int[10];
System.out.println("Enter the age of Students : ");
for(int i=0; i<10 ;i++){
age[i] = input.nextInt();
} 

for(int i=0; i<10 ;i++){
if(age[i] < 0){
System.out.println("Invalid age");
}
else{
if(age[i] >= 18){
System.out.println("The student with age " + age[i] + " can vote.");
}
else{
System.out.println("The student with age " + age[i] + " cannot vote.");
}
}
}
}
}