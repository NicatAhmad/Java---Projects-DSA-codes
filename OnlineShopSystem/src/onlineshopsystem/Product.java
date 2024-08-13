
package onlineshopsystem;


public class Product 
{
   private int productId ;
   private String productName;
   private double productPrice;
   
   
   public Product(final int id , final String name , final double price )
   {
	   productId = id ;
	   productName = name;
	   productPrice = price ;
	   
   }


	public int getProductId() {
		return productId;
	}
	
	
	public void setProductId(final int productId) {
		this.productId = productId;
	}
	
	
	public String getProductName() {
		return productName;
	}
	
	
	public void setProductName(final String productName) {
		this.productName = productName;
	}
	
	
	public double getProductPrice() {
		return productPrice;
	}
	
	
	public void setProductPrice(final double productPrice) {
		this.productPrice = productPrice;
	}
	   
	}