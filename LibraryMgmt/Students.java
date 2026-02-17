import java.util.*;

public class Students{
    Student[] thStudents = new Student[50];
    public static int count = 0;
    
    Scanner in = new Scanner(System.in);

    public void addStudent(Student student) {
        for (int i = 0; i < count; i++) {
            if (thStudents[i].regNo == student.regNo) {
                System.out.println("Student with registration number " + regNo + " already exist in record.");
                return;
            }
        }

        if (count < 50) {
            thStudents[count++] = student;
        }
    }

    public void showAllStudents() {
        System.out.println("Student Name\t\tRegistration Number");
        for (int i = 0; i < count; i++) {
            System.out.println(thStudents[i].studentName + "\t\t" + thStudents[i].regNo);
        }
    }
    
    public int isStudent() {
        System.out.print("Enter Reg No. of Student: ");
        int regNo = in.nextInt();

        for (int i = 0; i < count; i++) {
            if (thStudents[i].regNo == regNo) {
                return i;
            }
        }

        System.out.println("Student with RegNo. " + regNo + " is not registered.");
        System.out.println("Get registered first.");
        return -1;
    }

    public void checkOutBook(Books book) {
        
    }
}