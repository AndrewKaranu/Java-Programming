import java.util.Scanner;
public class Excercises {
    public static void main(String[] args) {
//        //Write a java program that swaps 2 numbers using a third variable
//        int a;
//        int b ;
//        int temp;
//
//        a = 10;
//        b = 20;
//    // Use a temporary variable to store the value of a to use in the assignment
//        temp = a;
//        a = b;
//        b = temp;
//
//        //or
//        temp = a + b;
//        a = temp - a;
//        b= temp - b;
//
//        System.out.println("Value of a is: "+a);
//        System.out.println("Value of a is: "+b);


//        Getting user input
    //1. You need to use the scanner class that has the input and output streams
    //2. To use scanner we need to import it from the java.util package-import java.util.Scanner;
    //3. Instantiate a scanner object;
        //scanner sc = new Scanner(System.in);

    //4. We have methods to read all the types of data in java from the scanner object

    //The methods are as follows;
    //a ->next(): Used to read strings from the keyboard or a file. sc.next()
    //b ->nextLine(): Also used to read strings from yhe keyboard sc.nextLine
    //c ->nextInt(): Use to read integers
    //d ->nextFloat(): Use to read integers
    //c ->nextByte(): Use to read integers
    //c ->nextLong(): Use to read integers

    // Create the scanner object
    Scanner sc = new Scanner(System.in);

    //Prompt the user to enter the first number
        System.out.println("Please enter the first number: ");

    //Assign a with the users values
        int a = sc.nextInt();

        //Prompt the user to enter the first number
        System.out.println("Please enter the second number: ");

        //Assign a with the users values
       int  b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is: "+a);
        System.out.println("Value of a is: "+b);
    }
}
