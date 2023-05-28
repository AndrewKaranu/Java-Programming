public class AssigmentStatements {
    public static void main(String[] args) {
        // Types of assignment statements in Java
        //There are three types of assignment statements in java
        //1. Simple assignment-
        int x = 10;
        //This is an example of a simple assignment where the value on the right is assigned on the left

        //We can also have variable on the right side, so the value of the variable on the RHS sits in the variable on the LHS
        int y = x;
        //2. Chained assignment
        //Is done to assign single a single value to multiple variables at once

        int a, b, c, d;
        a = b = c = d =200;
        System.out.println(c);
        //When using chained assignment, keep in mind that it cant be performed during declaration
        //3. Compound assignment
        //Whenever we use an assignment operator with some other operator to initialize value it's called compound assignment
        int z = 30;
        z+=20;
        System.out.println("The value of z is: "+z);
       // Points to remember
       // Whenever we use compound assignment, implicit type casting is automatically performed
//        byte u = 10;
//        u = u+1;
//        System.out.println("The value of b is: "+b);
        //You will get a compile time error

        byte v = 10;
        v+=30;
        System.out.println("The value of v is: "+v);

        //In case of compound assignment operators, typecasting will be performed automatically.
        //So, v+=30 is equivalent to v = (type of v)(v+=30)

        byte s = 10;
        s= (byte)(s+30);
        System.out.println("The value of s is: "+s);

    }
}
