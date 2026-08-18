import java.util.Scanner;

public class Books {
    Book[] theBooks = new Book[50];
    public static int count;

    Scanner in = new Scanner(System.in);

    public int compareBookObjects(Book b1, Book b2) {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
            System.out.println("Book of this name is already exists!");
            return 0;
        }
        if (b1.sNo == b2.sNo) {
            System.out.println("Book with this serial number already exists!");
            return 0;
        }
        return 1;
    }

    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (this.compareBookObjects(theBooks[i], b) == 0) {
                return;
            }
        }

        if (count < 50) {
            theBooks[count++] = b;
        } else {
            System.out.println("No space to add more books.");
        }
    }
    
    public void searchBySNo() {
        System.out.println("\t\t\t\t\tSearch by Serial Number\n");

        int sNo;
        System.out.print("Enter serial number of book: ");
        sNo = in.nextInt();

        System.out.println("S.No\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {
            if (theBooks[i].sNo == sNo) {
                printBook(theBooks[i]);
                return;
            }
        }
        System.out.println("No book for s.No " + sNo + " Found.");
    }
    
    public void searchByAuthorName() {
        System.out.println("\t\t\t\t\tSearch by author name");

        System.out.print("Enter Author Name: ");
        String authorName = in.nextLine();

        int flag = 0;
        for (int i = 0; i < count; i++) {
            if (theBooks[i].authorName.equalsIgnoreCase(authorName)) {
                printBook(theBooks[i]);
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("No Book of " + authorName + " Found.");
        }
    }

    public void showAllBooks() {
        System.out.println("\t\t\t\t\tShow All Books");
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            Book b = theBooks[i];
            printBook(b);
        }
    }
    
    public void upgradeBookQty() {
        System.out.println("\t\t\t\t\tUpgrade Books Qty");

        System.out.print("Enter serial number of book: ");
        int sNo = in.nextInt();

        for (Book b : theBooks) {
            if (b.sNo == sNo) {
                System.out.print("Enter number of books to be added: ");
                int addingQty = in.nextInt();

                b.bookQty += addingQty;
                b.bookCopyQty += addingQty;
                return;
            }
        }
    }
    
    public int isAvailable(int sNo) {
        for (int i = 0; i < count; i++) {
            Book b = theBooks[i];
            if (b.sNo == sNo) {
                if (b.bookCopyQty > 0) {
                    System.out.println("Book is Available.");
                    return i;
                } else {
                    System.out.println("Book is Unavailable.");
                }
            }
        }
        System.out.println("No book of sNo " +sNo+ " Available in Library.");
        return -1;
    }
    
    public Book checkOut() {
        System.out.print("Enter serial number of book to be checked out: ");
        int sNo = in.nextInt();

        int bookIndex = isAvailable(sNo);
        if (bookIndex != -1) {
            theBooks[bookIndex].bookCopyQty--;
            return theBooks[bookIndex];
        }
        return null;
    }
    
    public void checkIn(Book b) {
        for (int i = 0; i < count; i++) {
            if (theBooks[i].sNo == b.sNo) {
                theBooks[i].bookCopyQty++;
                return;
            }
        }
    }
    
    public void dispMenu()
    {

        // Displaying menu
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
                "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }
    
    public void printBook(Book b) {
        System.out.println(
                b.sNo + "\t\t"
                        + b.bookName + "\t\t"
                        + b.authorName + "\t\t"
                        + b.bookQty + "\t\t"
                        + b.bookCopyQty);
    }    
}