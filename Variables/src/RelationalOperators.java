public class RelationalOperators {
    public static void main(String[]args){
        //2.relational operators: are used to compare two operands and get a boolean value.
        //Output after using relational operators is always boolean because they are more of comparison type
        // == (equal to): This operator compares both the operands and return true if both operands are equal to each other else it will return false
        // != (not equal to): this operator compares both of the operands and returns false if both are equal ro each other.Otherwise it returns true
        // < (less than): compares both of the operands and returns true if the operand on the left is less than the value of the right. Else it will return false
        // > (greater than): compares both of the operands and returns true if the operand on the left is greater than the value of the right. Else it will return false
        // >= (greater than or equals to): compares both of the operands and returns true if the operand on the left is greater than or equals to the value of the right. Else it will return false
        // <= (less than or equals to): compares both of the operands and returns true if the operand on the left is less than or equals to the value of the right. Else it will return false

        int num1 = 20;
        int num2 = 30;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
    }
}
