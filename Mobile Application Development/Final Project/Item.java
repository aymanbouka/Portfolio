public class Item
{
// instance variables aka attributes aka state aka qualities aka fields aka members
   
    private String name;
    private String description;
    private double price;
    private String id; 
    private String size;
    private String type;
    
    public Item(String _id, String _name, double _price)
    {
        id = _id;
        name = _name;
        price = _price;

        System.out.println("Yo I've been created");

    }
    public String getId()
    {
        return id;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getName()
    {
        return name;
    }




    public String toString()
    {

        return id + " " + name + " \t " + price;
    }







}