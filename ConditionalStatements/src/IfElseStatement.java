import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        // if .... else in java

        //If statement
        //You may face scenarios where you might want to execute certain blocks of code based on certain conditions. This is where if else statements comes into the picture.
        //There might be scenarios where you might want to execute certain code if the condition is false. In this case you can use if with else statement

        // if (condition){
        // code to be executed
        // } else {
        // code to be executed
        // }

        //Here the statements within the braces are executed if the condition is true. However, if the condition is false the code is skipped

        int age = 18;

        if (age<18){
            System.out.println("You are underage");
        } else {
            System.out.println("You are of legal age");
        }

        int temp = 23;
        if (temp>23) {
            System.out.println("Cover Tomatoes");
        }else {
            System.out.println("Don't cover Tomatoes");
        }

        String favFruit = "Passion";

        if (favFruit == "Avocado"){
            System.out.println("Your favourite fruit is avocado");
        } else {
            System.out.println("Your favourite fruit is Passion");
        }

        //Write a java program for a bank which will allow users above 21 years to sign up and create an account. If the user is below 21 don't allow them to create an account
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        int user_age = sc.nextInt();

        if (user_age>21){
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }

    }
}
