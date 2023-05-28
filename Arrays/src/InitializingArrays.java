import java.util.Arrays;
import java.util.Scanner;

public class InitializingArrays {
    public static void main(String[] args) {
        //Initializing arrays

        //Using the subscript or index
        //Using one statement during creation

        //Using array.fill
        //You need to import the arrays package in order to use the fill method

        int numbers[] = new int[5];
        Arrays.fill(numbers,5);

        for (int i = 0;i<numbers.length;i++){
            System.out.println("Value of numbers["+i+"] is: "+numbers[i]);

        }



        //Using a for loop
        int ages[] = new int[5];

//        for (int i = 0;i<ages.length;i++) {
//            ages[i]= i +1;
//            System.out.println("Age: "+ ages[i]);
//        }

        for (int i = 0;i<ages.length;i++) {
            ages[i]= i +15;
            System.out.println("Age "+(i+1)+": "+ ages[i]);
        }


        //By taking user input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers separated with ,: ");
        String userNumber = sc.next();

        String[] individualNum = userNumber.split(",");
//        System.out.println(individualNum[0]);

        for (int i = 0;i < individualNum.length;i++) {
            int number[] = new int[5];
            number[i] = Integer.parseInt(individualNum[i]);
            System.out.println(number[i]);
        }

        int myArray[] = new int[5];
        System.out.println("Enter 5 integers: ");


        for (int i = 0; i<myArray.length; i++){
            myArray[i] = sc.nextInt();
        }

        for (int i = 0; i<myArray.length; i++) {
            System.out.println("Number "+(i+1)+": "+myArray[i]);
        }

//        int i=Integer.parseInt(individualNum[0]);
//        System.out.println(i);

//        int inputNumbers[] = new int[5];
//        for ()
    }
}
