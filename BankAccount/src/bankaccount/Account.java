
package bankaccount;


public class Account 
{
    protected int accountNumber ;
    protected String accountHolder;
    protected double balance ;
    
    public Account (int number , String holder , double initialBalance )
    {
        this.accountNumber = number ;
        this.accountHolder = holder ;
        this.balance = initialBalance;
        
    }
    
    public void withDraw (double amount )
    {
        if (amount > 0 && balance >= amount )
        {
            balance -= amount ;
            System.out.println("WithDraw: " + amount + " Balance: " + balance);
        }
    }
    public void deposit (double amount )
    {
        if (amount > 0 )
        {
            balance += amount ;
            System.out.println("Deposit: " + amount + "Balance: " + balance );
        }
    }
    
    public double getBalance ()
    {
        return balance ;
        
    }
}


