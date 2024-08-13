
package bankaccountmanagmentsystem;


public class SystemWork {

	public static void main(String[] args) {
		
      BankAccount account = new BankAccount(10001, "NicatAhmad", 10000.0);
      account.checkAccount();
      account.deposit(50000);
      account.checkAccount();
      account.withDraw(7000);
      account.checkAccount();
      
      account.deposit(100078);
      account.showBalance();
      
      Bank bank = new Bank();
      bank.addBankAccounts(account);
      bank.displayAllAccounts();
      
      bank.getAccounts().get(0).showBalance();
      
	}

}