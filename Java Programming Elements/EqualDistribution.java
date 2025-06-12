class EqualDistribution{
public static void main(String[] args){
int pens = 14;
int students = 3;
int pensEachStudentGet = pens / students;
int remainingPens = pens % students;
System.out.print("The Pen Per Student is " + pensEachStudentGet + " and the remaining pen not distributed is " + remainingPens);
}
}