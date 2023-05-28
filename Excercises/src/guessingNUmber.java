import java.util.Random;
import java.util.Scanner;

public class guessingNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 6: ");
        int answer = sc.nextInt();

        Random random = new Random();
        int number = random.nextInt(6);

        if (answer==number){
            System.out.println("The random number was "+number+". You have won");
        } else {
            System.out.println("The random number was "+number+". Try again");

        }
    }
}
