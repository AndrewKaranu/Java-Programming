public class ImplicitTypeCasting {
    public static void main(String[] args) {
        //Example
        byte b = 127;
        int x = b;
        System.out.println("Value of x: "+ x);

        //The byte type of value was automatically promoted to int type since we assigned it to int

        // Byte here has a smaller size than that of int. Byte is of 1 byte and int is of 4 bytes

        //Since the size of target data type is large, we did not get any error on assignment

        //This is known as implicit type casting where the value of the smaller data type is assigned and converted to the value of the bigger data type.

        //Implicit casting is performed by the compiler since the range of the smaller data type is within the range of the larger data type. This is also known as widening or upcasting

        //Possible conversions where implicit casting is performed=>
        //byte -> short -> int -> long -> float -> double
        //char -> int

        int i = 100;
        double d = i;
        System.out.println("Value of d is: "+d);

        char c = 'a';
        int r = c;
        System.out.println("Value of r is: "+r);


    }
}
