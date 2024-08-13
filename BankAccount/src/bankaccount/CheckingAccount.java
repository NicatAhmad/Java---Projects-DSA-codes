
package bankaccount;


public class CheckingAccount extends Account
{
    public CheckingAccount(int number , String holder , double initialBalance)
    {
        super(number , holder , initialBalance);
        
    }
    public void applyMonthlyFee(double fee )
    {
        balance -= fee;
        System.out.println("Monthly Fee Applied: Balance: " + balance );
    }
}
