public class Commission {
    //Create a class named Commission that includes three variables: a double sales figure, a double commission rate, and an integer commission rate. Create two overload methods named computeCommission(). The first method takes two double arguments representing sales and rate, mulplies them and then displays the result. The second method takes two arguments: a double sales figure and in integer commission rate. This method must divide the commission rate figure by 100.0 before multiplying by the sales figure and displaying the commission. Supply appropriate values for the variables and write a main() method that tests each overload method.

    public static void main(String[] args) {
        double numberofSales = 1000;
        double salesRate = 2000;
        int commissionRate = 10;
        computeCommission(computeCommission(numberofSales,salesRate),commissionRate);
    }

    static double computeCommission(double numberofSales, double saleRate){
            double salesFigure = numberofSales*saleRate;
        System.out.println("Sales worth Ksh "+salesFigure+" were made.");
        return (salesFigure);

    }

    static void computeCommission(double salesFigure, int commissionRate){
        int oneHundred = 100;
        double percentagecommissionRate = (double) commissionRate/oneHundred;
        double finalCommission = salesFigure*percentagecommissionRate;
        System.out.println("For Ksh "+salesFigure+" in sales, the commission is Ksh "+finalCommission+".");
    }
}
