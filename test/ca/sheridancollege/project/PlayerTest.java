/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;


import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {
    
    public PlayerTest() {
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

    /**
     * Test of cardplay method, of class PlayingCard.
     
    @Test
    public void testCardplay() {
        System.out.println("cardplay");
        LinkedList<Card> deckCPU = null;
        LinkedList<Card> deckP1 = null;
        String player1 = "";
        PlayingCard instance = new PlayingCard();
        instance.cardplay(deckCPU, deckP1, player1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * */
    @Test
    public void testShuffGood()
    {
        System.out.println("Testing size of  cards is Good");
        int si =25;
        int siz = 25;
        boolean expresult = true;
        boolean result = Player.checkShuff(si,siz);
        assertEquals(expresult,result);   
         
    }
    @Test
     public void testShuffBad()
    {
         System.out.println("Testing size of  cards is Bad");
        int si = 24;
        int siz = 24;
        boolean expresult = false;
        boolean result = Player.checkShuff(si,siz);
        assertEquals(expresult,result);   
        
    }
     @Test
      public void testShuffBoundary()
    {
         System.out.println("Testing size of  cards is Boundary");
          int si = 0;
        int siz = 0;
        boolean expresult = false;
        boolean result = Player.checkShuff(si,siz);
        assertEquals(expresult,result);   
        
    }
    
    
}
