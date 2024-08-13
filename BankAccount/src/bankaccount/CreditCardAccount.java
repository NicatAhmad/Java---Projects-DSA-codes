
package bankaccount;


public class CreditCardAccount  extends Account
{

    public CreditCardAccount(int number , String holder , double initialBalance ) 
    {
        super(number , holder , initialBalance);
        
    }
    public void makePurchase (double amount )
    {
        if(balance >= amount )
        {
            balance -= amount ;
            System.out.println("Purchase Made: Amount: " + amount +" Balance: " + balance );
        }
        else 
        {
            System.out.println("Insufficient Funds");
        }
    }
      
}
