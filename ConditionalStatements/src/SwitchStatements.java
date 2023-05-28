public class SwitchStatements {
    public static void main(String[] args) {
        //Switch Statement in java:
        //Switch statement allows you to execute  the statement based on certain value in a variable or expression

// switch(expression/variables) {
//  case x:
//      code block
//      break;
//  case y:
//      code block
//      break;
//  default:
//      code block
//}


    int age = 23;

    switch (age) {
        case 21:
            System.out.println("You are an adult");
            break;
        case 17:
            System.out.println("You are underage");
            break;
        default:
            System.out.println("Invalid age, Enter valid age");
    }

    //Points to remember about switch
    // 1. Switch can be used to evaluate a value in a variable or an expression
    // 2. Break is used to terminate switch once a match statement is executed
    // 3. Statements in default will be executed if no matching case statement is found

    //Rules of switch
    // 1. Variable in switch statements can only be int short byte char string enum
    // 2. Case label cannot have a variable it has to be a constant
    // 3. Case label has to be of the same data type as the variable or expression result in switch parenthesis


        int temp = 23;

    switch (temp) {
        case 23:
            System.out.println("Uncover Tomatoes");
            break;
        case 30:
            System.out.println("Cover your tomatoes");
        default:
            System.out.println("Stay indoors");
    }
    }
}
