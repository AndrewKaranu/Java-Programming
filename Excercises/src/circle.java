import java.util.Scanner;
import java.lang.Math;
public class circle {
    public static void main(String[] args) {
        //Write a java program that calculate the area and circumference of a circle. The user should provide the radius to our program
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle ");

        int radius = sc.nextInt();

        double pi = Math.PI;

        double circumference = Math.round(2*pi*radius);
        double area = Math.round(pi * (radius*radius));

        String message = String.format("The circle with a radius %d has a circumference of %f and an area of %f", radius, circumference, area);

        System.out.print(message);





    }
}
