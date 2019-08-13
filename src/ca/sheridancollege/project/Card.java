/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 */
class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    private int rank;
    private int suit;

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setSuit() {
        this.suit = suit;
    }

    @Override
    public String toString() {
        StringBuilder displayCard = new StringBuilder();

        if (rank == 11) {
            displayCard.append("Jack");
        } else if (rank == 12) {
            displayCard.append("Queen");
        } else if (rank == 13) {
            displayCard.append("King");
        } else if (rank == 14) {
            displayCard.append("Ace");
        } else {
            displayCard.append(rank);
        }
        
        displayCard.append(" of ");
        if (suit == 0){
            displayCard.append("Hearts");
        }
        else if (suit == 1){
            displayCard.append("Diamonds");
        }
        else if (suit == 2){
            displayCard.append("Spades");
        }
        else {
            displayCard.append("Clubs");
        }
        
        return displayCard.toString();
        
    }
    
}
