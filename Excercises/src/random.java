import java.util.Random;

public class random {
    public static void main(String[] args) {


        Random random = new Random();

        //It generates boolean value
        System.out.println(random.nextBoolean());
        //It generates double value
        System.out.println(random.nextDouble());
        //It generates float value
        System.out.println(random.nextFloat());
        //It generates int value
        System.out.println(random.nextInt());
        //It generates int value within specific limit
        System.out.println(random.nextInt(50));
        int low = 10;
        int high = 20;
        int result = random.nextInt(high - low) + low;
        System.out.println(result);
    }
}
