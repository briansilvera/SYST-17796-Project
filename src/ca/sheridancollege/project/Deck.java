/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class Deck 
{
    private List<Card> cardDeck = new ArrayList<Card>();
    private LinkedList<Card> deck1 =  new LinkedList<Card>();
    private LinkedList<Card> deck2 = new LinkedList<Card>();

    public LinkedList<Card> getDeck1() {
        return deck1;
    }

    public void setDeck1(LinkedList<Card> deck1) {
        this.deck1 = deck1;
    }

    public LinkedList<Card> getDeck2() {
        return deck2;
    }

    public void setDeck2(LinkedList<Card> deck2) {
        this.deck2 = deck2;
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(List<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }
    
    public void createDeck(){
        
    
     //create an ArrayList "cardDeck"
        
        for(int x=0; x<4; x++){          //0-3 for suit (4 suits)
            for(int y=2; y<15; y++){     //2-14 for rank (13 ranks)
                cardDeck.add(new Card(x,y)); //create new card and add into the deck
            } //end rank for
        }//end suit for
        
        Collections.shuffle(cardDeck, new Random()); //shuffle the deck randomly
        
       
     }
    
    public void dealDeck() {
         //creating 2 decks, each for player1/player2
//        LinkedList<Card> deck1 = new LinkedList<Card>();
//        LinkedList<Card> deck2 = new LinkedList<Card>();
        
        deck1.addAll(cardDeck.subList(0, 25));              //26 cards for p1       
        deck2.addAll(cardDeck.subList(26, cardDeck.size()));//26 cards for p2
    }
}//end class
