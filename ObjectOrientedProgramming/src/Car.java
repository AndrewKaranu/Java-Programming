public class Car {
    // class state/variables/properties/members
    String color;
    String model;
    int noOfWheels;
    int noOfDoors;

    int noOfSeats;

    int horsePower;

    int gearlevel = 0;


    //Class constructors

    public Car(String model, String color, int noOfWheels, int noOfSeats){
        this.model = model;
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
    }

    //Default constructor-In the case where the user doesn't set values the default values will be displayed
    public Car(){
        this.model = "model";
        this.color = "color";
        this.noOfWheels = 4;
        this.noOfSeats = 5;
    }
    //Methods/behaviours/actions
    public void shiftGear(){
        gearlevel++;
    }

    public void engageBreak(){

    }

    public void accelerate(){

    }
}