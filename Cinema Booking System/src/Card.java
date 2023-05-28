public class Card {

    String database;
    String cardType;
    String cardHolder;
    long cardNumber;
    int cardCVC;

    double cardBalance;


    public Card(String cardType, String cardHolder, long cardNumber, int cardCVC, double cardBalance) {
        this.cardType = cardType;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardCVC = cardCVC;
        this.cardBalance = cardBalance;
    }

    double validate() {
        if (cardBalance > 0) {
            return cardBalance;
        }
        return 0;

    }


}
