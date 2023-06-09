import java.util.Scanner;

public class TheDecider
{
    public static void main(String[] args)
    {
      
        Scanner console = new Scanner(System.in);
        System.out.print("What is the option for today: ");
        String _option = console.nextLine();
        System.out.print("Please type user1 name: ");
        String _user1 = console.nextLine();
        System.out.print("Please type user2 name: ");
        String _user2 = console.nextLine();
        
       
        
        decider(_option,_user1,_user2);
        
        System.out.println("Play (Y) or end to never mind: ");
    
        String input = console.nextLine();
        
        while(input.equalsIgnoreCase("y"))
        {
            decider(_option,_user1,_user2);
            System.out.println("You want to keep going? (y or end to finish): ");
            input = console.nextLine();
        }

    } // end main
    
    public static void decider(String _option, String _user1, String _user2)
    {
        double total = (double)(Math.random()) * 1;
            if(total > .5)
            {
                System.out.println(_user2 + " is going to " + _option);
            }
            else
            {
                System.out.println(_user1 + " is going to " + _option);
            }
       

       
    }//end decider method
} // end class