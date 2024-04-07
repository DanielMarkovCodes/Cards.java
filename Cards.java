public class Cards {
    // Define an enumerated type named Rank within the Cards class
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    public static void main(String[] args) {
        // Declare variables of type Rank
        Rank highCard, faceCard, card1, card2;

        // Assign values to the variables
        highCard = Rank.ACE;
        faceCard = Rank.JACK; // You can choose JACK, QUEEN, or KING
        card1 = Rank.THREE;   // You can choose any numbered card (TWO through TEN)
        card2 = Rank.TEN;     // You can choose any other numbered card

        // Print a line with highCard and faceCard objects
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);

        // Declare and assign variables for card values
        int card1Val = card1.ordinal() + 1; // Adding 1 because the ordinal starts from 0
        int card2Val = card2.ordinal() + 1;

        // Print lines with card1 and card2 objects
        System.out.println("A two card hand: (" + card1 + " and " + card2 + ")");
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
}


