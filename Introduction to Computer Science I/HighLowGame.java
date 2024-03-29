import java.util.*;

public class HighLowGame
{
public static void main(String[] args)
{
    
    Deck deck = new Deck();
    Scanner scnr = new Scanner(System.in);
    
    Card card1 = deck.drawCard();
    System.out.println("The first card is " + card1.declareCard());
    System.out.println("Will the nect card be higher or lower? ");
    System.out.println("Enter 1 for lower, 2 for higher.");
    
    int choice = scnr.nextInt();
    
    Card card2 = deck.drawCard();
    System.out.println("The next card is the " + card2.declareCard());
    
    boolean higher = card2.getValue(false) > card1.getValue(false);
    
    if(card1.getValue(false) == card2.getValue(false))
    {
        System.out.println("Card values were the same, no winner or loser this round. ");
    
    }
    else if((higher && choice==2) || (!higher && choice == 1))
    {
        System.out.println("Winner!");
    
    }
    else 
    {
        System.out.println("Sorry, your guess was incorrect :( ");
    }
    scnr.close();
    

}//end main
}//end class