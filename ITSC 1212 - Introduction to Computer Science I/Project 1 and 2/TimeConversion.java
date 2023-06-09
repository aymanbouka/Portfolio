/**
ITSC 1212 - 005 - von Briesen
//@Author Ayman Boukharraz
//@Since 9/30/2021 8:48

My code template (assignment name) Version 1.0
This code converts seconds to various time scales.
*/

public class TimeConversion 
{
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public void showDecaseconds(double num)
    {

        System.out.println("\n Decaseconds (a decasecond is 10 secs) ");
        System.out.println("\n A Decasecond is " + num/10);



    }


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public void showJiffies(double num)
    {

        System.out.println("\n Jiffie is 10 miliseconds)");
        System.out.println("\n A Jiffie is " + ((num*1000)/10));



    }


    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public void showNewYorkMinutes(double num)
    {

        System.out.println("\n a New York Minute (A new york minute is the period of time between the traffic lights turning green and the cab behind you honking");
        System.out.println("\n A New York Minute is " + num/20);



    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here

    public void showNanoCenturies(double num)
    {

        System.out.println("\n a Nanocentury (A nanocentury is a computing measurement coined from the expression -  never to let the user wait more than a few nanocenturies for a response. It is 3.156 seconds.)");
        System.out.println("\n A Nano Century is " + num/3.156);



    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here


    public void showScaramuccis(double num)
    {

        System.out.println("\n a Scaramucci  (A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.)");
        System.out.println("\n A Sacramucci is " + (num/950400));


    }
}//end class
