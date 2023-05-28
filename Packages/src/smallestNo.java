import java.util.Scanner;

public class smallestNo {
    public static void main(String[] args) {


        int nums[] = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        for (int i = 0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        int smallestNum = nums[0];


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > smallestNum) {
                smallestNum = nums[i];

            }
        }
        System.out.println("The largest number is: "+smallestNum);
    }
}
