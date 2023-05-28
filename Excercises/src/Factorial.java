import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number ");

        int number = sc.nextInt();
        int factorial  = 1;
        int x = 1;

        while (x<= number) {
            factorial *= x;
            x++;
        }
        System.out.println(factorial);

    }
}
