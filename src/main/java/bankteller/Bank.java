package bankteller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	// instructions
	// [X] Create a map called accounts
	// [x] public Collection<BankAccount> accounts() to return all accounts 
	// [X] A method to add a Bank Account
	// [X] A BankAccount method to get access a particular accountNum
	// [X] A BankAccount method to close a particular accountNum


	Map<String, BankAccount> accounts = new HashMap<>();

	public Collection<BankAccount> accounts() {
		return accounts.values();
	}

	public void addAccount(BankAccount account) {
		String accountNum = account.getAccountNum();
		accounts.put(accountNum, account);
	}

	public BankAccount getAccountByAccountNum(String accountNum) {
		return accounts.get(accountNum);
	}

	public void removeAccount(String removeAccount) {
		accounts.remove(removeAccount);
	}
}
