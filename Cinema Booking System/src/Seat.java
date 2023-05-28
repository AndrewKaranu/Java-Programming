public class Seat {
    String database;
    String seat_id = "B5";
    double price = 1000;
    boolean availability = false;



    //Seat method to check if a seat is free or taken
    String is_free(){
        String isFree = null;
        if (availability==true){
            System.out.println("Seat no: "+ seat_id + " is occupied");
            isFree = "no";
        } else if (availability==false) {
            System.out.println("Seat no " + seat_id + " is free");
            isFree = "yes";
        }
        return isFree;

    }
    //Seat method to occupy a seat if it is not taken
    void occupy(Card card){
        if (is_free()=="yes")
            if(card.validate()>=price){
                double balance = card.validate() - price;
                availability = false;
                System.out.println("You have booked seat no: "+ seat_id);
                System.out.println("Your new card balance is: "+ balance);
            } else if (card.validate()<price) {
                System.out.println("You have insufficient funds");
            }



    }
    }

