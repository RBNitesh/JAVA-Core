import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        // Displaying menu
        System.out.println(
            "********************Welcome to the GFG Library!********************");
        System.out.println(
            "                  Select From The Following Options:               ");
        System.out.println(
                "**********************************************************************");
             
        // creating obj of books class
        Books ob = new Books();

        // creating obj of students class
        Students obStudents = new Students();

        int choice, searchChoice;

        do{
            ob.dispMenu();
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    Book b = new Book();
                    ob.addBook(b);
                    break;
                case 2:
                    ob.upgradeBookQty();
                    break;
                case 3:
                    System.out.println(
                        " press 1 to Search with Book Serial No.");
                    System.out.println(
                            " Press 2 to Search with Book's Author Name.");
                    searchChoice = in.nextInt();

                    switch (searchChoice) {
                        case 1:
                            ob.searchBySNo();
                            break;
                        case 2:
                            ob.searchByAuthorName();
                    }
                    break;
                case 4:
                    ob.showAllBooks();
                    break;
                case 5:
                    Student s = new Student();
                    obStudents.addStudent(s);
                    break;
                case 6:
                    obStudents.showAllStudents();
                    break;
                case 7:
                    obStudents.checkOutBook(ob);
                    break;
                case 8:
                    obStudents.checkInBook(ob);
                default:
                    System.out.println("Enter 0 to 8");
            }
        }
        while (choice != 0);
    }
}