public class Menu
{
    private String Discription = "Menu";
   
   
    private Item[] menuItems =  {
    new Item01("01", "Basic Cheesburger", .99),
    new Item02("01", "Basic Double Cheesburger", 1.99),
    new Item03("01", "Basic Tripple Cheesburger", 2.99),
    new Item04("01", "Basic Fries", .50)
    };

    public Item[] getMenuItems()
    {
        return menuItems;
    }
    


    public String toString()
        {
            String menuText = description;

            for(int counter = 0; counter < menuItems.length; counter++)
         {
            description += menuItems[counter];
         }
            return menuText;
}



}