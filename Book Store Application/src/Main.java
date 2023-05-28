import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //arrays
        String bookNamearray[] = new String[100];
        String bookAuthorarray[] = new String[100];
        int bookIDarrray[] = new int[100];
        String bookReadarray[] = new String[100];


        //Objects
        Bookmethods methods = new Bookmethods();
        //Variables
        int choice = 0;
        int count = 0;


        do {
            System.out.println("CPL LIBRARY SYSTEM\nChoose an option:\n1. Add Book\n2. Print Book List\n3. Mark Book as Read\n4. Find Book\n5. Delete Book\n6. Exit");
            choice = input.nextInt();
            if (choice == 1) {
                count = methods.addBooks(bookNamearray,bookAuthorarray,bookIDarrray,bookReadarray,count);
            }else if (choice==2) {
                methods.listBooks(bookNamearray,bookAuthorarray,bookIDarrray,bookReadarray);
            }else if (choice==3) {
                methods.markasRead(bookNamearray,bookAuthorarray,bookIDarrray,bookReadarray);
            }else if (choice==4) {
                methods.findBook(bookNamearray,bookAuthorarray,bookIDarrray,bookReadarray);
            }else if (choice==5) {
                methods.deleteBook(bookNamearray,bookAuthorarray,bookIDarrray,bookReadarray,count);
            } else if (choice==6) {
                System.out.println("Good bye");
            }else {
                System.out.println("Invalid input");
            }

        } while (choice!=6);
    }
}