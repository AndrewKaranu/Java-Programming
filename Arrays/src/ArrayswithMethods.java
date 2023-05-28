public class ArrayswithMethods {
    public static void main(String[] args) {
        //Create a function that displays the elements of an array
        //Call that function in the main method
        int myNumbers[] = new int[]{1,2,3,4,5};

        int myNumbers[] = arrayvalues();

        //Same thing but
    }

    void displayArray(int[] myNumbers){


        for (int i = 0; i<myNumbers.length; i++){
            System.out.println("Value of myNumbers["+i+"]"+" is: "+myNumbers[i]);
        }
    }


}
