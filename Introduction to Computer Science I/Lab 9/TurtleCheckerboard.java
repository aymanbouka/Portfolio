public class TurtleCheckerboard 
{
    public static void main(String[] args) 
    {
        World w = new World(500,500);
        Turtle tom = new Turtle(w);
        tom.penUp();
        tom.moveTo(50,50);
        tom.setHeading(0);
        tom.penDown();
      int yPosition = 50;
         for(int y = 0; y < 4; y++)
          {
            tom.penUp();
            tom.moveTo(yPosition,50);
            tom.penDown();
            for(int x = 0; x < 4; x++)
            {
                
                tom.drawSquare();
                tom.turn(180);
                tom.penUp();
              tom.forward(100);
              tom.turn(180);
              tom.penDown();
            }
            
            yPosition = yPosition + 100;
          }//
        } 
    }
   
  

