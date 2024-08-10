package impementinginterfaces;

public class BankImpl implements Bank {
	private static final double DEPOSIT_LIMIT = 0;
	private static final double MIN_BALANCE = 0;

	public void deposit(Account account, double amount) {
		 if (amount > DEPOSIT_LIMIT)
				System.err.println("Deposit not possible.. exceeds Deposit Limit");
			else
				account.setBalance(account.getBalance()+amount);
	     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
	 }

	 public void withdraw(Account account, double amount) {
		 if (account.getBalance() - amount >= MIN_BALANCE)
		 {
				account.setBalance(account.getBalance()-amount);
				System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
		 }
		 else
			 System.out.println("Insufficient balance in account: " + account.getAccNo());
	 }
	}
	