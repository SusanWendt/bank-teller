package bankteller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
	
	public void close(String accountNum) {
		accounts.remove(accountNum);
	}
	
}
