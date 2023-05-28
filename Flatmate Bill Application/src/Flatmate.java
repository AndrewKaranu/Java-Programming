import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Flatmate {
    //Add a flatmate
    //Create a bill using days they've stayed
    //Returns total takes days and determines rent

    public int addFlatmate(String flatmateName[], String Paid[],int Days[],int count){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("How many days have you stayed this month?");
        int days = input.nextInt();

        flatmateName[count] = name;
        Days[count] = days;
        Paid[count] = "Not paid";
        count++;
        return count;
    }

    public void CalculateBill(String flatmateName[],int Days[] ,String Paid[] , double total, double Rent[]){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the name of the flatmate you want to bill: ");
        String name = input.nextLine();
        int flatIndex = Arrays.asList(flatmateName).indexOf(name);

        int totalDays = 0;
        for (int i = 0; i < Days.length; i++){
            totalDays = totalDays + Days[i];
        }

        int daysstayed = Days[flatIndex];
        double rentShare = (double) daysstayed/totalDays;
        double rent = total*rentShare;

        Rent[flatIndex] = rent;

        System.out.println(flatmateName[flatIndex]+" ,your rent is Ksh "+rent);

        System.out.println("Would you like to pay your bill of Ksh "+rent+" ?\n1. Yes \n2. No");
        int choice = input.nextInt();
        int low = 1000;
        int high = 9999;
        int result = random.nextInt(high - low) + low;
        int paymentNo = result;
        if (choice==1){
            Paid[flatIndex] = "Paid";
            System.out.println("          Reciept of payment          ");
            System.out.println("======================================");
            System.out.println("You have successfully paid Ksh "+rent);
            System.out.println("Payment no: "+paymentNo);
            System.out.println("Thank you!");
            System.out.println("======================================");
        }

    }

}
