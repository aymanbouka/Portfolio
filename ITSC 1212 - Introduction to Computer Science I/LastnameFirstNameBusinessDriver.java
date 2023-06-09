import java.util.*;

public class LastnameFirstNameBusinessDriver 
{
    public static void main(String[] args) 
    {
        // name of food service : Aymans pizza shack
        //
        String decorativeLine = "********************************************";
        System.out.println("\n" + decorativeLine);

        Scanner console = new Scanner(System.in);
        System.out.print("What's your name? ");
        String userName = console.nextLine();
        String greeting = "Hey there, " + userName + "!" + " Here's what we serve " + userName;
        System.out.println(greeting);
        String companyName = "Ayman's pizza shack";

        String name = "Ayman";

        System.out.println("Welcome to " + companyName);
        System.out.println("I am " + name + " What's you're name ?");

        String[] menuItems = new String[]{"pizza", "wings", "cheeseballs", "soda", "cookie", "salad", "soup", "frenchfries", "smoothie", "chips"};

        
        for(int counter = 0; counter < menuItems.length; counter++)
        {
            System.out.println(menuItems[counter]);
        }

        System.out.println("How many things are you ordering today? ");

        int numberOfItems = Integer.parseInt(console.nextLine());

        String[] orderedItems = new String[numberOfItems];

        System.out.println("What's item#");
        
        for(int counter = 0; counter <= numberOfItems; counter++)
        {
            int itemsSelected = Integer.parseInt(console.nextLine());
            orderedItems[counter] = menuItems[itemsSelected -1];

            //System.out.println(menuItemsList[counter]);

        }

        System.out.println("Thank you for ordering");
        
        
        
        
        
        
        System.out.println(decorativeLine + "\n");

        console.close();
    }// end main

}// end class