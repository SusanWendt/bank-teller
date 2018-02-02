package bankteller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<>();

	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNum(), account);
	}

	public BankAccount getAccountByAccountNum(String accountNum) {
		return accounts.get(accountNum);
	}

	public Collection<BankAccount> accounts() {
		return accounts.values();
	}
	public void showAccounts() {
		for (Entry<String, BankAccount> entry : accounts.entrySet()) {
			System.out.println( entry.getKey() + entry.getValue() + entry.getValue().getBalance());
		}
	}

	public void close(String accountNum) {
		accounts.remove(accountNum);
	}

	public void withdraw(String accountNum, double amount) {
		BankAccount withdrawFromAccount = getAccountByAccountNum(accountNum);
		withdrawFromAccount.withdraw(amount);
	}

	public void deposit(String accountNum, double amount) {
		BankAccount depositToAccount = getAccountByAccountNum(accountNum);
		depositToAccount.deposit(amount);
	}

}
