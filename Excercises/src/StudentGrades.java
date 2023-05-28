import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        //Write a java program that gets marks of 5 subjects of a student in CPL.
        //Calculate the average score and display the grade that the student got based on the average score
        //Use the following ranges to grade the student
        //80-100 -> A
        //70-79 -> B
        //60-69 -> C
        //50-59 -> D
        //0-49 -> F

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the students Name: ");
        String stuName = sc.next();

        System.out.print("Enter the students Math grade: ");
        int math = sc.nextInt();

        System.out.print("Enter the students Physics grade: ");
        int physics = sc.nextInt();

        System.out.print("Enter the students Chemistry grade: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter the students IT grade: ");
        int IT = sc.nextInt();

        System.out.print("Enter the students History grade: ");
        int history = sc.nextInt();

        int Totalmarks = math + physics + chemistry +IT + history;
        int Averagemark = Totalmarks/5;

        String grade = "";

        if (Averagemark>=80){
            grade = "A";
        } else if (Averagemark>=70 && Averagemark<=79) {
            grade = "B";
        }else if (Averagemark>=60 && Averagemark<=69) {
            grade = "C";
        }else if (Averagemark>=50 && Averagemark<=59) {
            grade = "D";
        } else if (Averagemark>=0 && Averagemark<=49) {
            grade = "F";
        } else if (Averagemark>100){
            grade = "Impossible Grade";
        }

        if (Averagemark>100){
            System.out.println("Error grade not possible");
        } else if (Totalmarks>500) {
            System.out.println("Invalid grades");
        } else if (math>100) {
            System.out.println("Invalid Grade: Grade cant be higher than 100");
        } else if (chemistry>100) {
            System.out.println("Invalid Grade: Grade cant be higher than 100");
        } else if (physics>100) {
            System.out.println("Invalid Grade: Grade cant be higher than 100");
        } else if (IT>100) {
            System.out.println("Invalid Grade: Grade cant be higher than 100");
        } else if (history>100) {
            System.out.println("Invalid Grade: Grade cant be higher than 100");
        } else {
            String finalMessage = String.format("%s scored a total of %d, an average of %d % giving them a grade of " + grade, stuName, Totalmarks, Averagemark);
            System.out.println(finalMessage);
        }
    }
}
