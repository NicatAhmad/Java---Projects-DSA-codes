
package bankaccount;


public class SavingsAccount extends Account 
{

    public SavingsAccount(int number , String holder , double initialBalance ) 
    {
        super(number , holder , initialBalance );
    }
    public void applyInterest (double rate )
    {
        balance += balance*rate;
        System.out.println("Interest Applied : Balance: " + balance );
    }
}
