package onlineshopsystem;

import java.util.ArrayList;

public class Order 
{
   private int ordId ;
   private String customerName ;
   private ArrayList<Product> objects = new ArrayList<Product>();
   
   public Order (final int id , final String name )
   {
	   ordId = id;
	   customerName = name ;
	   
   }

	public int getOrdId() 
	{
		return ordId;
	}
	
	public void setOrdId(final int ordId) 
	{
		this.ordId = ordId;
	}
	
	public String getCustomerName() 
	{
		return customerName;
	}
	
	public void setCustomerName(final String customerName) 
	{
		this.customerName = customerName;
	}
	   
	   
	

    public void addProducts (final Product obj)
    {
    	objects.add(obj);
    	
    }
    public ArrayList<Product> getOrderProducts()
    {
    	return objects;
    	
    }
    
    public double calculateProductsPrice ()
    {
    	double sum =0;
    	for (int i =0; i < objects.size(); i++)
    	{
    		sum = sum + objects.get(i).getProductPrice();
    	}
    	return sum ;
    	
    }
}