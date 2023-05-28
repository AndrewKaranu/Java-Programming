public class LogicalOperators {
    public static void main(String[]args){
        //3.Logical operators =>there are three kinds of logical operators in java
        // &&(and operator): this operator returns true if both operand are true
        // ||(or operator): returns true if any of the operands are true
        // !(not operator): this operator works with only one operand and reverses the boolean value

        int x = 20;
        int y = 30;

        System.out.println(y>x && x!=y);
        System.out.println(x>y || x<y);
        System.out.println();

    }
}
