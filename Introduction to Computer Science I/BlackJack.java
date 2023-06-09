import java.util.*;

public class BlackJack 
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
    
        System.out.println("The House is showing: " + houseTotal);
    
        while(playerTotal < 22) 
        {
            System.out.println("Players total is: " + playerTotal);
            System.out.println("Would you like to hit or stand? \n\tEnter 1 for hit or 0 or stand");
            int choice = scnr.nextInt();
    
            if(choice == 0)
            break;

            else if(choice == 1)
            {
                Card nextCard = deck.drawCard();
        
                System.out.println("The player has been dealt the " + nextCard.declareCard());
                playerTotal += nextCard.getValue(true);
            }
            else
            {
                System.out.println("Invalid option, try again.");
            }
        }//end while loop
            if(playerTotal > 21) 
            {
                System.out.println("The player has busted! You lose :(");
            }
    
       
         while(houseTotal < 22)
         {
            Card nextCard = deck.drawCard();

            if(houseTotal < 17)
            {
                System.out.println("House hits" + houseTotal);
               
                houseTotal += nextCard.getValue(true);
            }
            else if(houseTotal >= 17 || houseTotal <= 21)
             {
                System.out.println("House stands" + houseTotal);
                break;
             }
             



         }//end while loop
         if(houseTotal > 21)
         {
                 System.out.println("House busts, You Win :)" + houseTotal);
         }
         else if(houseTotal > playerTotal)
         {
             System.out.println("House Wins!" + houseTotal);
         }
         else
         {
             System.out.println("Player Wins" + houseTotal);
         }


        
    }//end main
    




}//end class
