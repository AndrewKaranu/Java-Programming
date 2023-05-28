import java.util.Scanner;

public class MethodsExamples {
    public static void main(String[] args) {
     //Call the greet user function
//     greetUser();
//     displayUsername("Andrew");
//     addTwoNumbers(3,3);



    }
//Create a method that greats the user
public static void greetUser() {
    System.out.println("Hello Everyone");
}

static void displayUsername(String name){
    System.out.println("My name is "+ name);
}

//Create a method that adds two numbers together and displays their sum

    static void addTwoNumbers(int num1, int num2){
        int sum = num1+num2;
        System.out.println(num1 + " + " + num2+ " = " + sum);
    }

//Create a method that calculates the radius of a circle

    static double areaOfCircle(double radius){
        double pi = Math.PI;
        double area = Math.round(pi * (radius*radius));

        return(area);
    }

}
