// Title: Cinema Booking
//Description: An app where the user ca book a cinema sear if the seat is free and if the user has balance in their card. The app generates a ticket if the purchase is succesful

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Your name: ");
//        String name = sc.next();
//
//        System.out.println("Preferred seat number: ");
//        String seatNo = sc.next();
//
//        System.out.println("Your card type: ");
//        String cardType = sc.next();
//
//        System.out.println("Card holder name: ");
//        String holderName = sc.next();
//
//        System.out.println("Your card number ");
//        Long cardNumber = sc.nextLong();
//
//        System.out.println("Card cvc: ");
//        int cvc = sc.nextInt();

        //Create all the objects
        User user = new User();
        Seat seat = new Seat();
        Ticket ticket = new Ticket();
        Card card = new Card("visa","Andrew",123456789,190, 3000);
//
        seat.occupy(card);
        seat.occupy(card);
    }
}