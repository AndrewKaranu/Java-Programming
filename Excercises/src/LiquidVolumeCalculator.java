import java.util.Scanner;
import java.lang.Math;
public class LiquidVolumeCalculator {
    public static void main(String[] args) {
        //Write a function that calculates the liquid volume in a sphere using the following formula

        //The radius r is always 10, so consider making it a default parameter
        //Pass 2 for h and get 4071.504...

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the height of the sphere: ");

        double height = sc.nextInt();

        int radius = 10;

        double pi = Math.PI;
//        double volume = pi * Math.pow(radius,2) * (height/3);
//        double volume = (double)(1/3) * pi * Math.pow(height,2) * ((3*radius) - height);
//        double volume = (double)(4/3)*pi*Math.pow(radius, 3);
        //volume = ((4 * pi * r ** 3) / 3) - (pi * h**2 * (3*r - h) / 3)
        double volume = ((4 * pi * (Math.pow(radius,3)) / 3) - (pi * Math.pow(height,2) * (3*radius - height) / 3));




        String message = String.format("The sphere with a radius 10 and height of %f has a volume of %f",height, volume);

        System.out.print(message);
    }
}
