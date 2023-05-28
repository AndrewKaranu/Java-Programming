import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        //Write a java program that lets a customer choose an option from a menu.
        //The program displays the order

        Scanner sc = new Scanner(System.in);

        System.out.print("Our Menu \n 1. Snacks \n 2. Food \n 3. Drinks");
        Integer mainMenu = sc.nextInt();

        if (mainMenu==1){
            System.out.print("Our Menu \n 1. Snack1 \n 2. Snack2 \n 3. Snack3 \n");


        }

    }
}
