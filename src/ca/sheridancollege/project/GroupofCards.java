package ca.sheridancollege.project;


import java.util.ArrayList;       
import java.util.Random;        
import java.util.List;          
import java.util.Collections;   
import java.util.LinkedList;    
import java.util.Scanner;

public abstract class GroupofCards {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Card> deck = new ArrayList<Card>(); //create an ArrayList "deck"
        
        for(int x=0; x<4; x++){          //0-3 for suit (4 suits)
            for(int y=2; y<15; y++){     //2-14 for rank (13 ranks)
                deck.add(new Game(x,y)); //create new card  deck
            } //end value for
        }//end suit for
        
        Collections.shuffle(deck, new Random()); //shuffle the deck 
        
        //creating 2 decks, each for player1/player2
        LinkedList<Card> deckC = new LinkedList<Card>();
        LinkedList<Card> deckP = new LinkedList<Card>();
        
        deckC.addAll(deck.subList(0, 25));              //26 cards        
        deckP.addAll(deck.subList(26, deck.size()));//26 cards
        
        String player1="";
        while(player1!=null)
        {
        System.out.println("Enter your name to play:");
        player1 = in.nextLine();
        System.out.println("-.-.--.-.-.-.-.-.-.--.-.-.--.-.-.-.-.--.-.-.--.-.-");
        boolean ans  = false;
        boolean ans1 = false;
        boolean ans2 = false;
         ans = check(player1);
         ans1 = checklength(player1);
         ans2 = checkDigit(player1);
         if(ans || ans1== false|| ans2 )
         {
             System.out.println("Error: Please enter the name properly");
             continue;
         }
         else
         {
                Player obj = new Player();
                obj.cardplay(deckC, deckP, player1);
                break;
         }
        }
    }//end main 
    public static boolean check(String player1)
    {
         for(int i =0; i< player1.length();i++)
        {
            char c = player1.charAt(i);
            if(!(Character.isLetterOrDigit(c)))
            {
                 return true;
            }
        }
         return false;
    }
    public static boolean checklength(String player1)
    {
        if(player1.length() >= 3 && player1.length() <= 10)
        {
            return true;
        }
        return false;
    }
    public static boolean checkDigit(String player1)
    {
         for(int i =0; i< player1.length();i++)
        {
            char c = player1.charAt(i);
            if(Character.isDigit(c))
            {
                 return true;
            }
        }
         return false;
    }
}//end class 
