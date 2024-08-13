
package onlineshopsystem;

public class OnlineShopSystem {

   
  public static void main(String[] args) 
	{
		Product p1 = new Product(1, "product1" , 10);
		Product p2 = new Product(2, "product2" , 15);
		Product p3 = new Product(3, "product3" , 20);
		
		Order order1 = new Order(2, "Nicat");
		order1.addProducts(p1);
		order1.addProducts(p2);
		order1.addProducts(p3);
		
		double  totalPrice = order1.calculateProductsPrice();
		
		System.out.println("Order ID: " + order1.getOrdId() + "\n" + "Customer Name: " + order1.getCustomerName());
		
		System.out.print("Ordered Products: ");
		for (Product product : order1.getOrderProducts())
		{
			System.out.print(product.getProductName() + " ,");
		}
		System.out.println();
		
		System.out.println("Total Price$" + totalPrice);

	}
    
}
