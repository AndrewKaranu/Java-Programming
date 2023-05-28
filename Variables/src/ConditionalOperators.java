public class ConditionalOperators {
    public static void main(String[] args) {
        //5.Conditional operators;
        //Operators in java can be classified into 3 types depending on the number of operands they operate on
        //1. Unary Operators - are the operators which take only 1 operand

        //2. Binary Operators - are the operators which take 2 operands

        //3. Ternary Operator - are the operators which take 3 operands. There is only one ternary operator in java which is also known as the conditional operator.

        //Syntax
        //boolean-expression ? true-expression : false-expression

        //if the boolean expression is evaluated to true then the true expression is evaluated
        //if the boolean expression is evaluated to false then the false expression is evaluated

        //Example of a ternary operator:
        //Lets use ternary operator to find out the greatest of two numbers

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("The greater number is: " + max);

        //Ternary operators can also be nested
        int maximum = (10>20)? 40 : ((50>60) ? 90 : 100);
        System.out.println(maximum);

    }

}
