public class AverageofArray {
    //Create a java program that calculates the average of an array using functions
    public static void main(String[] args) {
        int nums[] = new int[]{10, 20, 30, 40, 50};
        arrayAverage(nums);


    }

    static void arrayAverage(int nums[]) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            average = sum / nums.length;
        }
        System.out.println(average);


    }

}
