import java.util.Scanner;

public class ageInSeconds {
    public static void main(String[] args) {

        String name = inputName();
        double age = inputAge();

        System.out.println(displayAge(name, secondsLived(age), minutesLived(age), hoursLived(age), daysLived(age)));
    }
    //Create a java program that calculates the seconds the user has lived

    static String inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        return(name);
    }
    static double inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        double age = sc.nextDouble();
        return(age);
    }


    static double secondsLived(double age){
        double seconds = age*365*24*60*60;
        return(seconds);
    }
    static double minutesLived(double age){
        double minutes = age*365*24*60;
        return(minutes);
    } static double hoursLived(double age){
        double hours = age*365*24;
        return(hours);
    } static double daysLived(double age){
        double days = age*365;
        return(days);
    }

    static String displayAge(String name, double seconds, double minutes, double hours, double days){
        return(String.format("Hello %s. You have lived %f seconds, %f minutes, %f hours or %f days",name,seconds,minutes,hours,days));
    }
}
