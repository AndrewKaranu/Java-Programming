import java.util.ArrayList;
import java.util.Scanner;
public class test {


    public class Main {
        public static void main(String[] args) {
            ArrayList<String> bookNameList = new ArrayList<>();
            ArrayList<String> bookAuthorList = new ArrayList<>();
            ArrayList<Integer> bookIDList = new ArrayList<>();
            ArrayList<String> readList = new ArrayList<>();



            Scanner input = new Scanner(System.in);
            System.out.println("Enter the name of the book you would like to delete: ");
            String deleteTitle = input.nextLine();

            int deleteIndex = bookNameList.indexOf(deleteTitle);

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

}
