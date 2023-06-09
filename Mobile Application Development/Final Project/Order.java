public class Order
{

private storeName;
private Date date;
private Time time;
private String owner;
private double subTotal;
private double tax;
private double total;
private paymetType;

public double getSubtotal(Item[] _orderItems)
{

    for(int counter = 0; counter < _orderItems.length; counter++)
    {
       subtotal += _orderedItems[counter].getPrice();

    }
    return subtotal;
}

public double getTax()
{
    
}

public double getTotal()
{
    
}






public String toString()
{

String description = " "; //all stuff


return description;
}


}