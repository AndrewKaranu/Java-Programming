import java.util.Scanner;

public class oddNumber {
    static double numberInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        return number;
    }

    static void checkNumber(double number){
        if (number%2==0){
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        }
    }


    public static void main(String[] args) {
        checkNumber(numberInput());

    }
}
