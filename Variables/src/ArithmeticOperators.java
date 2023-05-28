public class ArithmeticOperators {
    //Arithmetic operators in java
    //types of operators-
    // 1.arithmetic operators:
    // +- used to perform addition on two or more operands
    // -: used to perform subtraction
    // /-used to perform division
    // *- used to perform multiplication
    // %- returns the remainder of the operation after division
    // ++-(increment)-increments the value by 1
    // -- (decrement)-decrements the value by 1
    //Increment operators are of two types.
    //1. Pre increment => value is incremented first and then assigned or used in an expression
    //2. Post increment => value is assigned ot used in an expression first and then incremented
    //2.relational operators:
    // ==
    // !=
    // <
    // >
    // >=
    // <=
    //3.Logical operators: &&, ||, !
    //4. Assignment operators: =. +=. -=, *+,/+, %=
    //5.Conditional operators; ?:

    public static void main(String[]args) {
        int x = 20;
        int y = 30;
        //Addition
        System.out.println(x + " + " + y + " = " + (x+y));
        //Subtraction
        System.out.println(y + " - " + x + " = " + (y-x));
        //Multiplication
        System.out.println(x + " x " + y + " = " + (x*y));
        //Division
        System.out.println(y + "/" + x + " = " + (y/x));
        //Modulus
        System.out.println(x + " % " + y + " = " + (x%y));
        //Decrement
        System.out.println(y + "--" + " = " + --y);
        //Increment
        System.out.println(x + "++" + " = " + ++x);

    }
}
