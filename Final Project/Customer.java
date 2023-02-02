public class Customer
{
    private String name;
    private String id;


    public Customer(String _name, String _id)
    {
        name = _name;
        id = _id;

    }

    public String getName() { return name; }
    public String getId() { return id; }
    
    public String toString()
    {
        return "Customer " + id + " " + name;

    }




}