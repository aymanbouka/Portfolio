import java.awt.Color;
/**
ITSC 1212 - 005 - von Briesen
@Author Ayman Boukharraz
@Since 8/23/2021 6:39

My code template (assignment name) Version 1.0
This is the sample code I will use now on. (Description)
*/

public class ITSC1212Lab3
{
    public static void main(String[] args)
     {

       String startMessage = "**************** Start ******************\n";
       System.out.println(startMessage);
       //
//Part A

        World w = new World(1000,1000);
        Turtle tom = new Turtle(w);
    
            tom.forward();
        //moves tom forward 100 pixels 
        tom.turn(270);
        //turns tom so it faces left
        tom.forward(100); 
       //moves tom forward 100 units
        tom.penUp();
        // pen up
        tom.forward(50);
        //moves tom forward 50 units
        tom.turn(180);
        //tom turns 180 degrees
        tom.penDown();
        //pen up
        tom.forward();
        
        tom.forward(100);
        //tom moves forward 100 units

        tom.penUp();
        tom.forward(100);
        tom.penDown();
        tom.forward(50);
        tom.turnRight();
        tom.forward(100);
        tom.turnRight();
        tom.forward(100);
        tom.turnRight();
        tom.forward(100);
        tom.turnRight();
        tom.forward(50);

        tom.penUp();
        tom.forward(150);
        tom.penDown();
        tom.forward(50);
        tom.turn(180);
        tom.forward(50);
        tom.turnLeft();
        tom.forward(100);
        tom.turn(180);
        tom.forward(100);
        tom.turnRight();
        tom.forward(50);
        tom.turnRight();
        tom.forward(100);
        tom.turn(180);
        tom.forward(100);
        tom.turnRight();
        tom.forward(50);
        tom.turnRight();
        tom.forward(100);
        tom.penUp();


        
        
//Part B

// tom.hexagon(100);
// // the code above is drawing a hexagon we added instruction too into the file we added at the biggening
// tom.turnLeft();
// tom.setPenColor(Color.BLACK);
// tom.hexagon(100);
// tom.turnLeft();
// tom.setPenColor(Color.MAGENTA);
// tom.hexagon(50);
// tom.turnLeft();
// tom.setPenColor(Color.CYAN);
// tom.hexagon(50);






        // 
       String endMessage = "\n******************* End ******************";
       System.out.println(endMessage);




     }// end main()
}//end class