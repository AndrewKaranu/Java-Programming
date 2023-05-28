import java.util.Scanner;
import java.lang.Math;
public class Hypotenuse {
    public static void main(String[] args) {
        //Create a java program that calculates the hypotenuse of a right-angled triangle
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the length of the base: ");

        double lengthOne = sc.nextDouble();

        System.out.print("Please enter the length of the height: ");

        double lengthTwo = sc.nextDouble();

        double hypotenuse = Math.sqrt((Math.pow(lengthOne,2)+(Math.pow(lengthTwo,2))));


        String answer = String.format("%.2f",hypotenuse);

        System.out.println("The length of the hypotenuse is: "+ answer);


    }
}
