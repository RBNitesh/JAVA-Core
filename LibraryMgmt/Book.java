import java.util.Scanner;

public class Book{
    public int sNo, bookQty, bookCopyQty;
    public String bookName, authorName;

    Scanner in = new Scanner(System.in);

    public Book() {
        System.out.println("Enter serial number of book: ");
        this.sNo = in.nextInt();

        System.out.println("Enter book name: ");
        this.bookName = in.nextLine();

        System.out.println("Enter author name: ");
        this.authorName = in.nextLine();

        System.out.println("Enter quantity of book: ");
        this.bookQty = in.nextInt();
        this.bookCopyQty = this.bookQty;
    }

}