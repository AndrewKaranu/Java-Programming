public class ExplicitTypeCasting {
    public static void main(String[] args) {
        //Explicit type casting in java
//        int x = 100;
//        byte y = x;
//        System.out.println("Value of y is: "+x);

        //The above code leads to an error since we are trying to assign byte which is a smaller data type to int which is larger than byte
        //Implicict type casting is not performed in this case for the same reason since there is a possibility of loss of information since larger data types has a larger range than that of the smaller data type

        //To do explixti type casting you have to add data type post assignment operator after the assignment operator
        //byte y = (byte) x;

        int x = 100;
        byte y = (byte)x;
        System.out.println("Value of y is: "+x);

        //  The above statement will compile succesfully

        //Points to remember
        //->Explicit type casting is performed when value of larger data type is assigned to a variable of smaller data type
        //->Explicit type casting is performed by the programmer - this is also known as narrowing or down casting

        //Possible conversions where expliccit type casting is performed:
        //double -> float -> long -> int -> short -> byte
        //int -> char

        int z = 20;
        char d = (char) z;
        System.out.println(z);

    }
}
