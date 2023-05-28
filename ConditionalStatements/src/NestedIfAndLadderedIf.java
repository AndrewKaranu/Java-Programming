import java.util.Scanner;

public class NestedIfAndLadderedIf {
    public static void main(String[] args) {
        //Nested if and Laddered if

        //Laddered if....else..if
        //They are used when they are multiple conditions to test/

//        if (condition) {
//            code to execute
//        } else if (condition 2) {
//            code to execute
//        } else{
//            code to execute if no condition is met
        //}
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the day: ");

        int day = sc.nextInt();

        if (day==1){
            System.out.println("It is Sunday");
        } else if (day==2) {
            System.out.println("It is Monday");
        } else if (day==3) {
            System.out.println("It is Tuesday");
        }else if (day==4) {
            System.out.println("It is Wednesday");
        }else if (day==5) {
            System.out.println("It is Thursday");
        }else if (day==6) {
            System.out.println("It is Friday");
        }else if (day==7) {
            System.out.println("It is Saturday");
        }
    }
}
