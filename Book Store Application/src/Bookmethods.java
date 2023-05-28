import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bookmethods {

    public int addBooks(String bookNamearray[], String bookAuthorarray[], int bookIDarray[], String Readarray[], int count) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the book name?");
        String bookName = input.next();

        System.out.println("Enter the book author?");
        String bookAuthor = input.next();

        int low = 1000;
        int high = 9999;
        int result = random.nextInt(high - low) + low;
        int bookID = result;

        String Read = "not read";

        System.out.println("You have successfully added " + bookName + " to the library.");
        bookNamearray[count] = bookName;
        bookAuthorarray[count] = bookAuthor;
        bookIDarray[count] = bookID;
        Readarray[count] = Read;
        count++;
        return count;


    }

    public void listBooks(String bookNamearray[], String bookAuthorarray[], int bookIDarray[], String Readarray[]) {
        System.out.println("The following books are in the library");

        for (int i = 0; i < bookNamearray.length; i++) {
            if (bookNamearray[i]!=null) {
                System.out.println((i + 1) + ". Book Name: " + bookNamearray[i] + "Book Author: " + bookAuthorarray[i] + "Book ID: " + bookIDarray[i] + " Book status: " + Readarray[i]);
            }
        }
    }

    public void markasRead(String bookNamearray[], String bookAuthorarray[], int bookIDarray[], String Readarray[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the book you want to mark as read: ");
        String name = input.nextLine();
        int bookIndex = Arrays.asList(bookNamearray).indexOf(name);

        Readarray[bookIndex] = "read";

        System.out.println(bookNamearray[bookIndex] +" by "+bookAuthorarray[bookIndex]+" has been marked as read.");
    }

    public void findBook(String bookNamearray[], String bookAuthorarray[], int bookIDarray[], String Readarray[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the book you want to find: ");
        String name = input.nextLine();
        int bookIndex = Arrays.asList(bookNamearray).indexOf(name);
        System.out.println("Book Name: " + bookNamearray[bookIndex] + "Book Author: " + bookAuthorarray[bookIndex] + "Book ID: " + bookIDarray[bookIndex] + "Book status: " + Readarray[bookIndex]);
    }

    public void deleteBook(String bookNamearray[], String bookAuthorarray[], int bookIDarray[], String Readarray[], int count) {

        ArrayList<String> bookNameList = new ArrayList<>(Arrays.asList(bookNamearray));
        ArrayList<String> bookAuthorList = new ArrayList<>(Arrays.asList(bookAuthorarray));
        ArrayList<Integer> bookIDList = new ArrayList<>();
        for (int id : bookIDarray) {
            bookIDList.add(id);
        }
        ArrayList<String> readList = new ArrayList<>(Arrays.asList(Readarray));
        Scanner input = new Scanner(System.in);



        System.out.println("Enter the name of the book you would like to delete: ");
        String deleteTitle = input.nextLine();

        int deleteIndex = -1;
        for (int i = 0; i < bookNameList.size(); i++) {
            if (bookNameList.get(i).equals(deleteTitle)) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex != -1) {
            System.out.println("Are you sure you want to delete: " + bookNameList.get(deleteIndex) + " by " + bookAuthorList.get(deleteIndex) + "\n1. yes \n2. no");
            int choice = input.nextInt();

            if (choice == 1) {
                bookNameList.remove(deleteIndex);
                bookAuthorList.remove(deleteIndex);
                bookIDList.remove(deleteIndex);
                readList.remove(deleteIndex);

                System.out.println("Book deleted successfully.");
            }
        } else {
            System.out.println("Book not found.");
        }



}
}
