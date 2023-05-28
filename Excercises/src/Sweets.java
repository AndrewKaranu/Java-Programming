public class Sweets {
    //Create a class named Sweets. Its maim() method holds an integer variable name numberofSweets to which you will assign a value. Create a method to which you pass numberofSweets. The method displays the sweets in dozens. Eg 40 sweets is 3 dozens and 4 left over

    public static void main(String[] args) {
        int numberofSweets = 40;
        dozens(numberofSweets);
    }

    static void dozens(int numberofSweets){
        int dozens = numberofSweets/12;
        int remainder = numberofSweets-(dozens*12);
        System.out.println(numberofSweets+ " sweets is "+dozens+" dozens with "+remainder+" left over.");


    }
}
