/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 */
public class GameTest {

    public GameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGoodCheckP1Win() {
        System.out.println("checkP1Win good testcase");
        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();
        Card p1Card = new Card(2, 2);
        Card p2Card = new Card(1, 1);
        boolean expResult = true;
        boolean result = Game.checkP1Win(p, p1Card, p2Card);
        assertEquals(expResult, result);
    }

    @Test
    public void testBadCheckP1Win() {
        System.out.println("checkP1Win bad testcase");
        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();
        Card p1Card = new Card(1, 1);
        Card p2Card = new Card(2, 2);
        boolean expResult = false;
        boolean result = Game.checkP1Win(p, p1Card, p2Card);
        assertEquals(expResult, result);
    }

    @Test
    public void testBoundaryCheckP1Win() {
        System.out.println("checkP1Win boundary testcase");
        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();
        Card p1Card = new Card(2, 2);
        Card p2Card = new Card(2, 2);
        boolean expResult = false;
        boolean result = Game.checkP1Win(p, p1Card, p2Card);
        assertEquals(expResult, result);
    }

    @Test
    public void testGoodCheckP2Win() {
        System.out.println("checkP2Win good testcase");
        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();
        Card p1Card = new Card(1, 1);
        Card p2Card = new Card(2, 2);
        boolean expResult = true;
        boolean result = Game.checkP2Win(p, p1Card, p2Card);
        assertEquals(expResult, result);
    }

    @Test
    public void testBadCheckP2Win() {
        System.out.println("checkP2Win bad testcase");
        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();
        Card p1Card = new Card(2, 2);
        Card p2Card = new Card(1, 1);
        boolean expResult = false;
        boolean result = Game.checkP2Win(p, p1Card, p2Card);
        assertEquals(expResult, result);
    }

    @Test
    public void testBoundaryCheckP2Win() {
        System.out.println("checkP2Win boundary testcase");
        Deck p = new Deck();
        p.createDeck();
        p.dealDeck();
        Card p1Card = new Card(2, 2);
        Card p2Card = new Card(2, 2);
        boolean expResult = false;
        boolean result = Game.checkP2Win(p, p1Card, p2Card);
        assertEquals(expResult, result);
    }

}
