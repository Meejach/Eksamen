public class Card {

    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean beats(Card cardToBeat) {

        if (suit.equals("spades")) {
            if (cardToBeat.suit.equals("hearts")) {
                return true;
            } else if (value > cardToBeat.value) {
                return true;
            }
        } else if (suit.equals("hearts")) {
            if (cardToBeat.suit.equals("diamonds")) {
                return true;
            } else if (value > cardToBeat.value) {
                return true;
            }
        } else if (suit.equals("diamonds")) {
            if (cardToBeat.suit.equals("clubs")) {
                return true;
            } else if (value > cardToBeat.value) {
                return true;
            }
        } else if (suit.equals("clubs")) {
            if (value > cardToBeat.value) {
                return true;
            }
        }

        return false;
    }
}
