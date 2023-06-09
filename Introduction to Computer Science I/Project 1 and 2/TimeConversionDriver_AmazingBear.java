/**
ITSC 1212 - 005 - von Briesen
@Author Ayman Boukharraz
@Since 9/30/2021 8:48

My code template (assignment name) Version 1.0
This code converts seconds to various time scales.
*/

import java.util.Scanner;

public class TimeConversionDriver_AmazingBear 
{

    public static void main(String[] args) 
    {

        // statements for output formatting
        System.out.println("\n*******************************");
        System.out.println("\n Start - Time Conversion Program");
        System.out.println("\n *******************************");


        // variable to store user input
        int numSeconds;
        String name;
        /**
         * TO DO: ask the user to enter the number of seconds to be converted 
         * and assign the value to numSeconds
         */  
        // add your code here
        
        Scanner aScanner = new Scanner(System.in);
        System.out.println("\n input number of seconds");
        numSeconds = aScanner.nextInt();

        
        
        String startMessage = "\n ********************************   START   ****************************\n";
        System.out.println("\n Welcome to the Amazing Bear inc Time Calculator");
        String bannerMessage = " //\\   |\\//|  //\\   // | |\\ | // `    |__) |__   //\\  |__) \n" +
                               "//~~\\  |   | //~~\\ //_ | | \\| \\__>    |__) |___ //~~\\ |  \\ \n";
                                                        
        Scanner aScanner2 = new Scanner(System.in);
        System.out.println("\n input name");
        name = aScanner2.nextLine();


                               
                               







        
        String endMessage = "\n================================ END =====================================";


        
        // you do not need to add anything below this line
        // create TimeConversion object
        TimeConversion converter = new TimeConversion();

        // call method to calculate Decaseconds
        converter.showDecaseconds(numSeconds);

        // call method to calculate Jeffies
        converter.showJiffies(numSeconds);

        // call method to calculate New York minutes
        converter.showNewYorkMinutes(numSeconds);

        // call method to calculate Nano Centuries 
        converter.showNanoCenturies(numSeconds);

        // call method to calculate Scaramuccis
        converter.showScaramuccis(numSeconds);

        // statements are for output formatting
        System.out.println("*******************************");
        System.out.println("End - Time Conversion Program");
        System.out.println("*******************************");
    }//end main method
}//end class
