
package bankaccount;


public class SystemWork 
{
    public static void main(String[] args) 
    {
      SavingsAccount savings = new SavingsAccount(1001 , "Nicat" , 10000);
      CheckingAccount checking = new CheckingAccount(2001, "Metin", 15000);
      CreditCardAccount creditCard = new CreditCardAccount(3001 , "Bagir" , 5000);
      
      
      savings.deposit(500);
      savings.applyInterest(0.05);
      savings.withDraw(200);
      
      checking.applyMonthlyFee(10);
      
      
      creditCard.makePurchase(200);
      creditCard.makePurchase(400);
    }
    
}
