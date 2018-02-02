package bankteller;

public class BankAccount {

	// [x] 3 instance variables String accountNum, String type, double balance
	// [X] note the accountNum will be a unique identifier
	// [X] create Constructor that handles the instance data in order above
	// [X] create appropriate methods needed for bank transactions

	private String accountNum;
	private String type;
	private double balance;
	
	public BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public BankAccount() {

	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "(" + accountNum + ") "+ type + " " + balance;
	}
	public double getBalance() {
		return balance;
	}

	public void deposit(double amountToDeposit) {
		if (amountToDeposit > 0) {
			balance = balance + amountToDeposit;
		} else {
			balance = balance + 0;
		}
	}

	public void withdraw(double amountToWithdraw) {
		if (amountToWithdraw > 0) {
			balance = balance - amountToWithdraw;
		} else {
			balance = balance - 0;
		}
	}
}
