
package bankaccountmanagmentsystem;


import java.util.ArrayList;

public class Bank 
{
     
     private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>() ;
     
     
   
     public void  addBankAccounts (BankAccount acc)
     {
    	 accounts.add(acc);
    	 
     }
     
     public void displayAllAccounts ()
     {
    	 for (int i =0; i< accounts.size(); i++)
    	 {
    		 System.out.println(accounts.get(i));
    	 }
     }
     
     public ArrayList<BankAccount> getAccounts ()
     {
    	 return accounts ;
     }
}

