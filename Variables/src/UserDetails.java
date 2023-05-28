import java.util.Scanner;
public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = sc.next();

        System.out.print("Please enter your gender: 1.male 2.female");

        int user_input = sc.nextInt();

        String gender = "";

        if (user_input == 1) {
            gender = "male";
        } else if (user_input == 2) {
            gender = "female";
        }



        System.out.print("Please enter your age: ");

        int age = sc.nextInt();

        System.out.println("Hello "+name+", You are a "+ gender + " student and you are "+age+" years old");



        //Write a java program that calculate the area and circumfrence of a circle. The user should provide the radius to our program


    }
}
