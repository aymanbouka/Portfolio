//import javax.lang.model.util.ElementScanner6;



public class Deck 
{
  
public Card drawCard()
{
    //Fill in the contents of this method.
    //eturn new Card(value, suit);

//   String suit;
//   int value;

   
    

    int value = (int)((Math.random() * 13) + 1);
   
    int randomSuit = (int)((Math.random() * 4) + 1);
    String suit;
   
    // int spades = 1;
    
    // int clubs = 2;
    
    // int hearts = 3;
    
    // int diamonds = 4;

    if(randomSuit == 1)
    {
        suit = "Spades";
        //value = 1;
    }
    else if(randomSuit == 2)
    {
        suit = "Clubs";
       // value = 2;
    }
    else if(randomSuit == 3)
    {
        suit = "Diamonds";
        //value = 3;
    }
    else //(randomSuit == 4)
    {
        suit = "Hearts";
        //value = 4;
    }

    
    return new Card(value, suit);


}//End Method

}//End class
