
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public  class Player extends GroupofCards{
    
    public void cardplay(LinkedList<Card> deckC,LinkedList<Card> deckP,String player1)
    {
        int si = deckC.size();
        int siz = deckP.size();
        boolean res = false;
         res = checkShuff(si,siz);
         if(res)
         {
      
             System.out.println("Error: The size of the shuffled deck between players are not equal.");
       
         }
         else
         {  
              
             
              while(true){
            Card p1Card = deckC.pop();  //each player place one card face up
            Card p2Card = deckP.pop();
            
            //display the face up card
            
            System.out.println(player1 + " plays card is " + p1Card.toString());
            System.out.println("Computer plays card is " + p2Card.toString());
            
            System.out.println("                                    ");
            
            
            //rank comparation between two cards
            if(p1Card.getValue() > p2Card.getValue()){//if player 1 win 
                deckC.addLast(p1Card);  //higher value wins both cards and 
                deckC.addLast(p2Card);  //places them at the bottom of his deck.
                System.out.println(player1 + " wins the round");
                
            }//end if
 
            else if(p1Card.getValue() < p2Card.getValue()){//if player 2 win 
                deckP.addLast(p1Card);   
                deckP.addLast(p2Card);  
                System.out.println("Computer wins the round");
               
            }//end else if
            
            else { //war happens when both cards' value matched
                
                System.out.println("                   ");
                
                //creating war cards
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();
                
                //checking do players have enough (4)cards 
                for(int x=0; x<3; x++){ 
                    //either one player runs out of card is game over
                    if(deckC.size() == 0 || deckP.size() == 0 ){                      
                        break;
                    }//end if
                    
                    System.out.println("War card for " + player1 + "is xx\nWar card for Computer is xx");

                    war1.add(deckC.pop());  //place additional card for war
                    war2.add(deckP.pop());                  
                }//end for
                
                //only compare result when both players have enough cards for war
                
                if(war1.size() == 3 && war2.size() == 3 ){
                    //display the war cards from each player
                   
                    System.out.println("                   ");
                    
                    System.out.println("                   ");
                     
                    System.out.println("War card for " +player1 +"  is " + war1.get(0).toString());
                    System.out.println("War card for Computer is " + war2.get(0).toString());
                    
                    //if player 1 wins the war round
                    if(war1.get(2).getValue() > war2.get(2).getValue()){
                        deckC.addAll(war1); //player1 get all 10 cards
                        deckC.addAll(war2);
                        System.out.println(player1 + " wins the war round");
                         
                    }//end if
                    //otherwise player 2 wins the war round
                    else{
                        deckP.addAll(war1); //player2 get all 10 cards
                        deckP.addAll(war2);
                        System.out.println("Computer wins the war round");
                        System.out.println("                   ");
                        
                    }//end else                      
                }//end if
                
            }//end war round else
            
            //game over either one player runs out of card(deck size is 0)
            if(deckC.size() == 0 ){
                System.out.println("game over\n" + player1 + " wins the game");
                 
                break;
            }
            else if(deckP.size() == 0){
                System.out.println("game over\n Computer wins the game");
                 
                break;
            }
          
        }//end while
              System.out.println("                                 ");
         }
        
    }
    public static boolean checkShuff(int si,int siz)
    {
        if(si == 25 && siz == 25)
        {
            return true;
        }
        return false;
    }
}
    
    

