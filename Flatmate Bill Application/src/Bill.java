import java.util.Scanner;

public class Bill {

    public double billDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("What month is it?");
        String month = input.next();
        System.out.println("Fill in the amounts for the various bills: ");
        System.out.println("Electricity bill: ");
        double electricity = input.nextInt();
        System.out.println("Water bill: ");
        double water = input.nextInt();
        System.out.println("Monthly rent: ");
        double rent = input.nextInt();

        double total = electricity+water+rent;
        System.out.println("Bill successfully for "+month+" generated:\na. Rent for "+month+": Ksh "+rent+"\nb. Electricity bill: Ksh "+electricity+"\nWater bill: Ksh"+water+"\n\n The total bill for the month of "+month+" is Ksh"+total);

        return total;


    }
}
