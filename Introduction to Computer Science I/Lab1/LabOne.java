/**
ITSC 1212 - 005 - von Brieson
@Author Ayman Boukharraz
@Since 8/23/2021 6:39

My code template (Lab 2) Version 1.0
This is the sample code I will use now on. (Description)
*/



public class LabOne 
{

    public static void main(String[] args)
     {

       String startMessage = "**************** start ******************/n";
       //
       //A
       //short x = 0;
       //short y = 2000;
       //int z = 1000000;

       // char a = 'a';
        //char b = 'b'; 

        //boolean boo = true;
       //System.out.println(x + y + z);
       //System.out.println(a + b);
       //System.out.println(x < y);
       //System.out.println(y > z);
       //System.out.println(z < a);
       //System.out.println(boo);
       
//B
      //int ex = 5.0;

      //int ex = (int) 4.9;
      //System.err.println(ex);

      //double x = 8.8;
     // double y = 2.2;

      //System.out.println(x / y);
     // System.out.println(x / (int) y);
     // System.out.println( (int) x / y);
      //System.out.println((int) (x / y));

      //double cost = 10.10;
      //double paid = 12.33;
      //double change = paid - cost;

      //System.out.println("The change owed on this transation: " + change);
       
     // System.out.println("The change owed on this transation: " + (double) ((int)(change * 100)) / 100);

//C
      int days = 11111;
      int years = (days / 365); //Figure out how many years
      days = (days % 365); //how many days are left over after removing years = 365 days
     int weeks = (days / 7);
     days = (days % 7);

    System.out.println(years);
      
    System.out.println(days);
      
     
      
    System.out.println(weeks);



       //
       String endMessage = "/n************ end ************";

       System.out.println(startMessage);

       System.out.println(endMessage);




     }// end main()
}//end class