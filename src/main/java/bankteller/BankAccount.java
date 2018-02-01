package bankteller;

public class BankAccount {

	// [x] 3 instance variables String accountNum, String type, double balance
	// [] note the accountNum will be a unique identifier
	// [] create Constructor that handles the instance data in order above
	// [] create appropriate methods needed for bank transactions

	String accountNum;
	String type;
	double balance;

	public BankAccount() {

	}

	public BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public String getAccountNum() {

		return accountNum;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

}
