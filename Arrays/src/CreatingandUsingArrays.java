public class CreatingandUsingArrays {

    public static void main(String[] args) {


        //Creating an array

        //1. Declare an array
        //2. Allocate memory
        //Initialize the array

        //Declaration
        //data-type array-name[]
        //data-type [] array-name

        int ages[];
        int[] rollNumbers;

        //Allocate memory
        //array-name = new data-type[size]

        ages = new int[5];
        rollNumbers = new int[10];

        //Initialization
        //array-name[index] = value;

        ages[0] = 12;
        rollNumbers[0] = 1270;

        int numbers [];

        numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 3;
        numbers[3] = 2;
        numbers[4] = 1;

//        for(initialization;condition;update){}

        for(int x = 0; x<numbers.length;x++){
            System.out.println("Value of x is numbers["+x+"] is: "+ numbers[x]);
        }

        System.out.println(numbers[2]);

        //To access each element  in the array, the concept of subscript, index or position comes in
        //The first element is at index 0, the second at index 1, the third at index 2 and the fourth at index 3 and the  fifth at index 4

        //Combining declaration and memory allocation
        //data-type array-name[] = new int[size]
        int y[] = new int[5];

        //Combining declaration, memory allocation and initialization
        //data-type array-name[] = new int[]{define values}
        double salary[] = new double[]{25,30,40,45,50};

        //display the length of the array

        System.out.println(salary.length);

        for(int x = 0; x<salary.length;x++){
            System.out.println("Salary "+ (x+1) +" is: "+ salary[x]);
        }



    }
}
