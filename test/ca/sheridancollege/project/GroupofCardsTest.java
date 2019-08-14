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


public class GroupofCardsTest {
    
    public GroupofCardsTest() {
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
     * Test of main method, of class GamePlayer.
     *
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GamePlayer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
    public void testMainGood(){
        
        System.out.println("Testing Name's specialcharacter is Good");
        String pass = "Ravi Kumar";
        boolean expresult = true;
        boolean result = GroupofCards.check(pass);
        assertEquals(expresult,result);
        
        
    }
    @Test
    public void testMainBad(){
        System.out.println("Testing Name's specialcharacter  is Bad");
        String pass = "Prachi P@tel";
        boolean expresult = true;
        boolean result = GroupofCards.check(pass);
        assertEquals(expresult,result);   
        
    }
    @Test
    public void testMainBoundary(){
         System.out.println("Testing Name's specialcharacter  is Boundary");
        String pass = "";
        boolean expresult = false;
        boolean result = GroupofCards.check(pass);
        assertEquals(expresult,result);   
        
    }
     @Test
    public void testLengthGood(){
        
        System.out.println("Testing length of Name  is Good");
        String pass = "Ravi Kumar";
        boolean expresult = true;
        boolean result = GroupofCards.checklength(pass);
        assertEquals(expresult,result);
        
        
    }
    @Test
    public void testLengthBad(){
        System.out.println("Testing length of Name  is Bad");
        String pass = "Pr";
        boolean expresult = false;
        boolean result = GroupofCards.checklength(pass);
        assertEquals(expresult,result);   
        
    }
    @Test
    public void testLengthBoundary(){
         System.out.println("Testing length of Name  is Boundary");
        String pass = "";
        boolean expresult = false;
        boolean result = GroupofCards.checklength(pass);
        assertEquals(expresult,result);   
        
    }
    public void testDigitGood(){
        
        System.out.println("Testing digit in Name  is Good");
        String pass = "Prachi Patel";
        boolean expresult = true;
        boolean result = GroupofCards.checkDigit(pass);
        assertEquals(expresult,result);
        
        
    }
    @Test
    public void testDigitBad(){
        System.out.println("Testing digit in Name  is Bad");
        String pass = "Prachi P2tel";
        boolean expresult = true;
        boolean result = GroupofCards.checkDigit(pass);
        assertEquals(expresult,result);   
        
    }
    @Test
    public void testDigitBoundary(){
         System.out.println("Testing digit in Name  is Boundary");
        String pass = "";
        boolean expresult = false;
        boolean result = GroupofCards.checkDigit(pass);
        assertEquals(expresult,result);   
        
    }
    
}
