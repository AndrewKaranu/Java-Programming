import java.util.Scanner;
import java.lang.Math;


public class SendingParticle {
    //Write a program to calculate charges for sending particles when the charges are as follows. For the first 1 KG Ksh 15.00. For additional weight for every 500 gm or fraction there of Ksh8

    public static void main(String[] args) {
        double InitialRate = 15;
        double additionalRate = 8;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the particle you want to send: ");
        float weight = input.nextFloat();



        if (weight<=1){
            System.out.println("You have been charged Ksh"+ InitialRate + " for this particles");
        } else if (weight>1) {
            float unit = weight-1;
            double multiple = unit/0.5;
            double roundedMultiple = Math.ceil(multiple);
            double addedCost = additionalRate*roundedMultiple;
            double totalCost = addedCost+InitialRate;
            System.out.println("You have been charged Ksh "+totalCost+ " for this particles");

        }
    }
}
