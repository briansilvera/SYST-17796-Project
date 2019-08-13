/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;        //import Random
import java.util.List;          //import List
import java.util.Collections;   //import Collections

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game {

    public static boolean checkP1Win(Deck p, Card p1Card, Card p2Card) {

        if (p1Card.getRank() > p2Card.getRank()) {//if player 1 win 
            Card winCard2 = p.getDeck2().pop();  //creates card of p2 called wincard2 
            p.getDeck1().add(winCard2); //gives wincard to p1
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkP2Win(Deck p, Card p1Card, Card p2Card) {

        if (p1Card.getRank() < p2Card.getRank()) {//if player 2 win 
            Card winCard1 = p.getDeck1().pop(); //creates card of p1 called wincard1 
            p.getDeck2().add(winCard1); //gives wincard to p2
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();

        //Collections.shuffle(cardDeck, new Random()); //shuffle the deck randomly
        //creating 2 decks, each for player1/player2
        while (true) {
            Card p1Card = p.getDeck1().pop();  //each player place one card face up
            Card p2Card = p.getDeck2().pop();

            //display the face up card
            System.out.println("Player 1 plays card is " + p1Card.toString());
            System.out.println("Player 2 plays card is " + p2Card.toString());

            //rank comparation between two cards
            if (checkP1Win(p, p1Card, p2Card) == true) {
                System.out.println("PLayer 1 wins the round");
            }//end if
            else if (checkP2Win(p, p1Card, p2Card) == true) {
                System.out.println("PLayer 2 wins the round");
            }//end else if
            else { //war happens when both cards' rank matched
                System.out.println("War");

                //creating war cards
                List<Card> war1 = new ArrayList<>();
                List<Card> war2 = new ArrayList<>();

                //checking do players have enough (4)cards to stay in game
                for (int x = 0; x < 3; x++) {
                    //either one player runs out of card is game over
                    if (p.getDeck1().isEmpty() || p.getDeck2().isEmpty()) {
                        break;
                    }//end if

                    System.out.println("War card for player1 is xx\nWar card for player2 is xx");

                    war1.add(p.getDeck1().pop());  //place additional card for war
                    war2.add(p.getDeck2().pop());
                }//end for

                //only compare result when both players have enough cards for war
                if (war1.size() == 3 && war2.size() == 3) {
                    //display the war cards from each player
                    System.out.println("War card for player1 is " + war1.get(0).toString());
                    System.out.println("War card for player2 is " + war2.get(0).toString());

                    //if player 1 wins the war round
                    if (war1.get(2).getRank() > war2.get(2).getRank()) {
                        p.getDeck1().addAll(war1); //player1 get all 10 cards
                        p.getDeck1().addAll(war2);
                        System.out.println("Player 1 wins the war round");
                    }//end if
                    //otherwise player 2 wins the war round
                    else {
                        p.getDeck2().addAll(war1); //player2 get all 10 cards
                        p.getDeck2().addAll(war2);
                        System.out.println("Player 2 wins the war round");
                    }//end else                      
                }//end if

            }//end war round else

            //game over either one player runs out of card(deck size is 0)
            if (p.getDeck1().isEmpty()) {
                System.out.println("game over\nPlayer 1 wins the game");
                break;
            } else if (p.getDeck2().isEmpty()) {
                System.out.println("game over\nPlayer 2 wins the game");
                break;
            }
        }//end while  

    }//end main       
}//end WarCardGame class
