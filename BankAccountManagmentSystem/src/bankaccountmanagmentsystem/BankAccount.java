
package bankaccountmanagmentsystem;


public class BankAccount 
{
     private int accountnumber ;
     private String holderName ;
     private double balance ;
     
     public BankAccount ()
     {
    	 this.accountnumber=0;
    	 this.holderName=null;
    	 this.balance=0;
     }
     
     public BankAccount(final int accountnumber , final String holderName , final double balance   )
     {
    	 this.accountnumber = accountnumber;
    	 this.holderName = holderName;
    	 this.balance = balance ;
    	 
     }
     
     
     
     public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit (double amount )
     {
    	 if (amount > 0)
    	 {
    	     balance += amount ;
    	     System.out.println("Deposit successful. New balance: " + balance );
    	 
    	 }
    	 else 
    	 {
    		 System.out.println("Invalid deposit amount...");
    	 }
     }
     public void withDraw (double amount )
     {
    	 if (amount > 0)
    	 {
    		 if (amount <= balance)
    		 {
    			 balance -= amount;
    			 System.out.println("Withdraw successful. new balance: " + balance );
    		 }
    		 else 
    		 {
    			 System.out.println("Invalid withDraw amount..");
    		 }
    	 }
     }
     
     public void checkAccount ()
     {
    	 System.out.println("Account Holder: " + holderName +"\n" + "Account Number: "+accountnumber + "\n" + "Balance: " + balance  );
    	 
     }
     
     
     public void showBalance ()
     {
    	 System.out.println("My Balance: " + balance );
     }
     
}