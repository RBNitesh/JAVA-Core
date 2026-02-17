import java.util.*;

public class Students{
    Student[] thStudents = new Student[50];
    public static int count = 0;
    
    Scanner in = new Scanner(System.in);

    public void addStudent(Student student) {
        for (int i = 0; i < count; i++) {
            if (thStudents[i].regNo == student.regNo) {
                System.out.println("Student with registration number " + student.regNo + " already exist in record.");
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
        int studentIndex = this.isStudent();

        if (studentIndex != -1) {
            System.out.println("Checking out");

            book.showAllBooks();
            Book b = book.checkOut(); // checked out book

            System.out.println("Checking out");
            if (b != null) {
                if (thStudents[studentIndex].booksCount < 3) {
                    System.out.println("adding book");
                    // add the checked out book in student account
                    thStudents[studentIndex].borrowedBooks[thStudents[studentIndex].booksCount] = b;
                    thStudents[studentIndex].booksCount++;
                    return;
                }
                System.out.println("Student can't borrow more than three books.");
            }

            // not available
            System.out.println("Book is not available.");
        }
    }
    
    public void checkInBook(Books book) {
        int studentIndex = this.isStudent();

        if (studentIndex != -1) {
            // printing credentials corresponding to student
            System.out.println("SNo\t\tBook Name\t\tAuthor Name");
            Student student = thStudents[studentIndex];

            for (int i = 0; i < student.booksCount; i++) {
                System.out.println(
                        student.borrowedBooks[i].sNo + "\t\t"
                                + student.borrowedBooks[i].bookName + "\t\t"
                                + student.borrowedBooks[i].authorName);
            }

            System.out.print("Enter Serial number of book to be checked in: ");
            int sNo = in.nextInt();

            for (int i = 0; i < student.booksCount; i++) {
                if (sNo == student.borrowedBooks[i].sNo) {
                    book.checkIn(student.borrowedBooks[i]);
                    student.borrowedBooks[i] = null;
                    return;
                }
            }

            System.out.println("Book of Serial Number " + sNo + " not Found");
        }
    }
}