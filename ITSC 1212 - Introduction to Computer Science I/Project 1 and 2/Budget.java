/**
ITSC 1212 - 005 - von Briesen
//@Author Ayman Boukharraz
//@Since 9/30/2021 8:48

My code template (Budget Project 1) Version 1.0
This code is meant to display a TA bills after taxes
*/

public class Budget
{
  public static void main(String[] args)
     {

       String startMessage = "**************** Start ******************\n";
       System.out.println(startMessage);
       //

        System.out.println("Amazing Bear Services");

      Double monthlyRent = 625.0;
      
      Double monthlyInternetService = 27.0;
      
      Double monthlyGroceryBill = 250.0;
      
      Double monthlyFunAllowance = 150.0;
      
      Double hourlyWage = 10.0;
      
      Double hourlyWageAfterTax = 10.0 * .9;
      
      Double sumTotal = (monthlyRent + monthlyInternetService + monthlyGroceryBill + monthlyFunAllowance);
      
      
      
      
      System.out.println(hourlyWage);
      System.out.println(monthlyRent);
      System.out.println(monthlyInternetService);
      System.out.println(monthlyGroceryBill);
      System.out.println(monthlyFunAllowance);
      System.out.println(sumTotal + " = total monthly expenses");
      System.out.println((sumTotal/hourlyWageAfterTax) / 4.0 + " how many hours per week the student would have to work to break even");
      System.out.println(((sumTotal + 100) / hourlyWageAfterTax) / 4.0 + " how many hours the student would have to work to save $100 a month after paying all expenses");









        // 
       String endMessage = "\n******************* End ******************";
       System.out.println(endMessage);




     }// end main()
}//end class