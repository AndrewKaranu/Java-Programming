import java.util.Scanner;

public class Main {

    //Title: Flatmates Bill Application

    //Description: An app that gets input of the amount of bill for a particular period and the days that each of the flatmates staying in the house and returns how much each flatmate has to pay, and it also generates a PDF report stating the names of the flatmates, the periods and how much each had to pay.

    //Object)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Arrays
        String FlatmateName[] = new String[10];
        int Days[] = new int[10];
        String Paid[] = new String[10];
        double Rent[] = new double[10];

        //Variables
        int choice = 0;
        int count = 0;
        double total = 0;

        //Objects
        Flatmate flatmate = new Flatmate();
        Bill bill = new Bill();
    do {
        System.out.println("Choose an option: \n1. Add flatmate details\n2. Create monthly house bill\n3. Individual bill payment\n4. Flatmate payment status\n5. Exit");
        choice = input.nextInt();

        if (choice==1){
            count = flatmate.addFlatmate(FlatmateName,Paid,Days,count);
        } else if (choice==2) {
            total = bill.billDetails();
        }else if (choice==3) {
            flatmate.CalculateBill(FlatmateName,Days,Paid,total,Rent);
        }else if (choice==4) {
            System.out.println("Payment status");
            for (int i = 0; i < FlatmateName.length; i++){
                if (FlatmateName[i]!=null) {
                    System.out.println("Name: " + FlatmateName[i] + "Days Stayed: "+Days[i]+ "days "+"Rent: Ksh "+Rent[i]+" Status: " + Paid[i]);
                }
            }
        }else if (choice==5) {

        } else {
            System.out.println("Invalid Input");
        }
    } while (choice!=5);

    }
}