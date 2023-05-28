public class Main {
    public static void main(String[] args) {
        //Create an object from Human class
        //Instantiate class human

        human Andrew = new human();
        Andrew.name = "Andrew";
        Andrew.age = 12;

        //call/access the class behaviours/methods

        Andrew.displayUsername();
        Andrew.displayUserAge();
        Andrew.laugh();

        Car nissan = new Car("GTR", "white", 4, 5);
        nissan.shiftGear();
//        System.out.println(nissan.gearlevel);
        System.out.println(nissan.model);
        System.out.println(nissan.color);
        System.out.println(nissan.noOfWheels);
        System.out.println(nissan.noOfSeats);
    }
}