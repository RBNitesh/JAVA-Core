import java.util.*;

public class Student {
    String studentName;
    int regNo;

    Book[] borrowedBooks = new Book[3];
    public int booksCount = 0;

    Scanner in = new Scanner(System.in);

    public Student() {
        System.out.print("Enter the name of student: ");
        this.studentName = in.nextLine();

        System.out.println("Enter registeration number of student: ");
        this.regNo = in.nextInt();
    }
}