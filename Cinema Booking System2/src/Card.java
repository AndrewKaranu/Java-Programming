public class Card {

    String database;
    String cardType;
    String cardHolder;
    long cardNumber;
    int cardCVC;

    public Card (String cardType, String cardHolder, long cardNumber, int cardCVC){
        this.cardType = cardType;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardCVC = cardCVC;
    }
    void validate(double price){

    }

}
