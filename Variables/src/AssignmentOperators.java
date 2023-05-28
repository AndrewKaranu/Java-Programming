public class AssignmentOperators {
    public static void main (String[]args){
        //4. Assignment operators =>
        // =(assignment operators): this operator assigns the value on the RHS to the variable on the LHS
        // +=(): can be used asa short form of (a = a + b); so using this operator we can write the above statement as (a+=b)
        // -=(): can be used asa short form of (a = a - b); so using this operator we can write the above statement as (a-=b)
        // *+(): can be used asa short form of (a = a * b); so using this operator we can write the above statement as (a*=b)
        // /=(): can be used asa short form of (a = a / b); so using this operator we can write the above statement as (a/=b)
        // %=():can be used asa short form of (a = a % b); so using this operator we can write the above statement as (a%=b)

        int a = 2;
        int b = 3;
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
    }
}
