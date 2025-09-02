package workshop;
import java.util.*;

class Student {
    String studentName;
    String studentId;
    int mathMarks;
    int scienceMarks;
    int computerMarks;
    int englishMarks;

    Student(String studentName, String studentId, int mathMarks, int scienceMarks, int computerMarks, int englishMarks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.computerMarks = computerMarks;
        this.englishMarks = englishMarks;
    }

    // Calculate percentage out of 400
    public double getAverage() {
        int total = mathMarks + scienceMarks + computerMarks + englishMarks;
        return total / 4;
    }

    public List<Integer> getMarksList() {
        return Arrays.asList(mathMarks, scienceMarks, computerMarks, englishMarks);
    }
}

public class StudentReport {

    static Map<String, Student> reportMap = new HashMap<>();

    // Add new student
    public static void addNewStudent(String name, String id, int mathMarks, int scienceMarks, int computerMarks, int englishMarks) {
        reportMap.put(id, new Student(name, id, mathMarks, scienceMarks, computerMarks, englishMarks));
    }

    // Update existing student marks
    public static void updateMarks(String id, int newMath, int newScience, int newComputer, int newEnglish) {
        Student student = reportMap.get(id);
        if (student != null) {
            student.mathMarks = newMath;
            student.scienceMarks = newScience;
            student.computerMarks = newComputer;
            student.englishMarks = newEnglish;
        } else {
            System.out.println("No Existing Student with this ID");
        }
    }

    // Get average percentage of all students
    public static double getAverageMarksOfAllStudent() {
        if (reportMap.isEmpty()) return 0;
        double totalAvg = 0;
        for (Student student : reportMap.values()) {
            totalAvg += student.getAverage();
        }
        return totalAvg / reportMap.size();
    }

    // Get average percentage by student ID
    public static double averageByStudentId(String id) {
        Student student = reportMap.get(id);
        if (student != null) {
            return student.getAverage();
        }
        System.out.println("Student not found!");
        return 0;
    }

    // Get top-performing student
    public static String getTopPerformer() {
        String topId = "";
        double maxAvg = 0;
        for (Map.Entry<String, Student> entry : reportMap.entrySet()) {
            double avg = entry.getValue().getAverage();
            if (avg > maxAvg) {
                maxAvg = avg;
                topId = entry.getKey();
            }
        }
        return topId;
    }

    // Display report
    public static void displayReport() {
        for (Map.Entry<String, Student> entry : reportMap.entrySet()) {
            Student student = entry.getValue();
            System.out.println("ID: " + student.studentId + ", Name: " + student.studentName +", Marks: " + student.getMarksList() +", Average: " + student.getAverage()+"");
            }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int choice;
        do {
            System.out.println("\n--------Student Reports----------");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Marks");
            System.out.println("3. Get Average of All Students");
            System.out.println("4. Get Average of Particular Student");
            System.out.println("5. Get Top-Performing Student");
            System.out.println("6. Display All Student Reports");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter name of student: ");
                    String name = input.nextLine();
                    System.out.print("Enter ID of student: ");
                    String id = input.nextLine();
                    System.out.print("Enter Math marks: ");
                    int math = input.nextInt();
                    System.out.print("Enter Science marks: ");
                    int science = input.nextInt();
                    System.out.print("Enter Computer marks: ");
                    int computer = input.nextInt();
                    System.out.print("Enter English marks: ");
                    int english = input.nextInt();
                    addNewStudent(name, id, math, science, computer, english);
                    break;
                }
                case 2: {
                    System.out.print("Enter ID of student to update: ");
                    String id = input.nextLine();
                    System.out.print("Enter updated Math marks: ");
                    int math = input.nextInt();
                    System.out.print("Enter updated Science marks: ");
                    int science = input.nextInt();
                    System.out.print("Enter updated Computer marks: ");
                    int computer = input.nextInt();
                    System.out.print("Enter updated English marks: ");
                    int english = input.nextInt();
                    updateMarks(id, math, science, computer, english);
                    break;
                }
                case 3: {
                    double avgAll = getAverageMarksOfAllStudent();
                    System.out.printf("Average of All Students: \n" +  avgAll);
                    break;
                }
                case 4: {
                    System.out.print("Enter ID of student: ");
                    String id = input.nextLine();
                    double avg = averageByStudentId(id);
                    System.out.printf("Average of Student with ID :" + id +" is " + avg);
                    break;
                }
                case 5: {
                    String topId = getTopPerformer();
                    if (!topId.isEmpty()) {
                        System.out.println("Top-performing Student ID: " + topId);
                    } else {
                        System.out.println("No students available.");
                    }
                    break;
                }
                case 6: {
                    displayReport();
                    break;
                }
                case 7:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(flag);
        input.close();
  }
}
