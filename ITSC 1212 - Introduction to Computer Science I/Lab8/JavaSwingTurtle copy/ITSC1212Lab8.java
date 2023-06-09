import java.util.Scanner;
import java.awt.Color;
public class ITSC1212Lab8 
{
    
    static int randomX = 0;
    static int randomY = 0;
    static World w = new World(500,500);

    public static void main(String[] args) throws InterruptedException
    {
        System.out.print(randomX);
        System.out.print(randomY);

        Turtle tom = new Turtle(randomX,randomY,w);
        Scanner scnr = new Scanner(System.in);

        tom.setVisible(false);
        randomX = ((int) (Math.random() * 100)) * 5;
        randomY = ((int) (Math.random() * 100)) * 5;


        System.out.println("Enter A guess for the X position of Tom: ");
        int guessX = scnr.nextInt();

        System.out.println("Enter A guess for the Y position of Tom:");
        int guessY = scnr.nextInt();
        
        while(guessX != randomX || guessY != randomX)
        {
           if(guessX != randomX)
           {
               guessX = scnr.nextInt();
               
            
               if(guessX == randomX)
                    {

                        System.out.print("Good guess!");
                        

                    }
              else if(guessX > randomX)
                    {

                        System.out.print("sorry too high!");
                        System.out.println("your guess for Y was too low! Guess higher!");
                        colorGuessX(guessX);
                     }

             else if(guessX < randomX)
                    {
                        System.out.println("sorry too low!");
                    }
                if(guessY != randomY)
                    {
                        guessY = scnr.nextInt();
                        
                     
                        if(guessY == randomY)
                             {
         
                                 System.out.print("Good guess!");
                                 
         
                             }
                       else if(guessY > randomY)
                             {
         
                                 System.out.print("sorry too high!");
                              System.out.println("your guess for Y was too low! Guess higher!");
                                colorGuessY(guessY);
                              }
         
                      else if(guessY < randomY)
                             {
                                 System.out.println("sorry too low!");
                             }
                
         
           }//End First If statment
          
        }//End While
        System.out.println("You found the turtle!!!!");
        tom.setVisible(true);
        scnr.close();
        
    }//End Main Method
//new code added
    public static void colorGuessY(int y) {
        Turtle jen = new Turtle(w);
        jen.penUp();
        jen.setVisible(false);
        jen.setPenColor(Color.black);
        if (y > randomY) {
          for (int i = 0; i <= y ; i++) {
            jen.moveTo(0,i);
            jen.penDown();
            jen.setHeading(90);
            jen.forward(499);
            jen.penUp();
            
          }
        } else {
          for (int i = 0; i >= y; i--) {
            jen.moveTo(0, i);
            jen.penDown();
            jen.setHeading(90);
            jen.forward(499);
            jen.penUp();
            
            
          }
        }
      
    
      }
    
    
      public static void colorGuessX(int x) throws InterruptedException {
        Thread.sleep(10);
        Turtle jen = new Turtle(w);
        jen.penUp();
        
        jen.setVisible(false);
        jen.setPenColor(Color.black);
        if (x > randomX) {
          for (int i = 0; i <= x; i++) {
            jen.moveTo(i, 0);
            jen.penDown();
            jen.setHeading(180);
            jen.forward(500);
            jen.penUp();
            
          }
        } else {
          for (int i = 0; i >= x; i--) {
            jen.moveTo(i, 0);
            jen.penDown();
            jen.setHeading(180);
            jen.forward(499);
            jen.penUp();
            
            
          }
        }
        
      }//code that was added ends here
}

} //End Class