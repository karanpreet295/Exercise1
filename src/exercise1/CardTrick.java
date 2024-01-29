package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author karanpreet kaur gill
 * @author karanpreet kaur gill Jan 28, 2024 
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];

        
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1); 
            card.setSuit(Card.SUITS[random.nextInt(4)]); 
            hand[i] = card;
        }

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-10): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a suit (1-Hearts, 2-Diamonds, 3-Clubs, 4-Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]); 

        
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        
        if (matchFound) {
            printInfo();
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is karanpreet kaur gill, but you can call me karan");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println(" Became a web developer");
        System.out.println("Be more attentive ");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Dancing");
        System.out.println(" Cooking");
        System.out.println("Watching TV");
        System.out.println("Making reels");

        System.out.println();
        
    
    }

}
