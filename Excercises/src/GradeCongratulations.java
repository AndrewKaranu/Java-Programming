import java.util.Scanner;

public class GradeCongratulations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");

        String grade = sc.next();

//        if (grade=="A"){
//            System.out.println("Excellent");
//        } else if (grade=="B") {
//            System.out.println("Amazing");
//        } else if (grade=="C") {
//            System.out.println("Amazing");
//        } else if (grade=="D") {
//            System.out.println("Amazing");
//        } else {
//            System.out.println("Invalid Grade Entered");
//        }

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Amazing");
                break;
            case "C":
                System.out.println("Well Done");
                break;
            case "D":
                System.out.println("You can do better");
                break;
            default:
                System.out.println("Invalid Grade Entered");
                break;
                
        }
    }
}
