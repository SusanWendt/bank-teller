package bankteller;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// [X] A Bank object called myBank
		// [ ] A BankAccount object called account1 with the following properties
		// ("1111","Checking",500.00)
		// [ ] A BankAccount object called account2 with the following properties
		// ("2222","Savings",2500.00)
		// [X] Have myBank add the 2 accounts to the map
		// [X] Set up a user interface to give similar output to the console:
		// [ ] Note: When displaying your accounts use an enhanced for loop
		Scanner input = new Scanner(System.in);

		Bank myBank = new Bank();

		myBank.addAccount(new BankAccount("1111", "Checking", 500.00));
		myBank.addAccount(new BankAccount("2222", "Savings", 2500.00));

		System.out.println("Here are your accounts at our bank: ");

		System.out.println(myBank.getAccountByAccountNum("1111"));
		System.out.println(myBank.getAccountByAccountNum("2222"));

		String option = "";

		do {
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to check balance");
			System.out.println("Press 4 to close an account");
			System.out.println("Press -1 to exit");
			String optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				System.out.println("Which account would you like to deposit to? ");
				System.out.println(myBank.getAccountByAccountNum("1111"));
				System.out.println(myBank.getAccountByAccountNum("2222"));
				String accountChosen = input.nextLine();
				System.out.println("Enter deposit amount: ");
				double depositAmount = input.nextDouble();
				System.out.println("You have chosen to deposit " + depositAmount);
				System.out.println("Your new balance is: ");
				myBank.deposit(accountChosen, depositAmount);
				System.out.println(myBank.getAccountByAccountNum(accountChosen));
				input.nextLine();
			} else if (optionEntered.equals("2")) {
				System.out.println("Which account would you like to withdraw from? ");
				System.out.println(myBank.getAccountByAccountNum("1111"));
				System.out.println(myBank.getAccountByAccountNum("2222"));
				String accountChosen = input.nextLine();
				System.out.println("Enter withdraw amount: ");
				double withdrawAmount = input.nextDouble();
				System.out.println("You have chosen to withdraw " + withdrawAmount);
				System.out.println("Your new balance is: ");
				myBank.withdraw(accountChosen, withdrawAmount);
				System.out.println(myBank.getAccountByAccountNum(accountChosen));
				input.nextLine();
			} else if (optionEntered.equals("3")) {
				System.out.println("balances:");
				System.out.println(myBank.getAccountByAccountNum("1111"));
				System.out.println(myBank.getAccountByAccountNum("2222"));
			} else if (optionEntered.equals("4")) {
				System.out.println("You have chosen to close an account. ");
				System.out.println("Type 'continue' to close or type 'back' to return to menu");
				String choice = input.nextLine();
				if (choice.equals("continue")) {
					System.out.println("Which account would you like to close? ");
					System.out.println(myBank.getAccountByAccountNum("1111"));
					System.out.println(myBank.getAccountByAccountNum("2222"));
					String accountChosen = input.nextLine();
					System.out.println("You have chosen to close " + accountChosen);
					System.out.println("Type 'confirm' to close or type 'back' to return to menu");
					String choice1 = input.nextLine();
					if (choice1.equals("confirm")) {
						myBank.close(accountChosen);
						System.out.println(myBank.getAccountByAccountNum(accountChosen));
						System.out.println("Your account has been closed. Press 3 to see available accounts.");
					} else {
						System.out.println("No accounts were closed.");
					}
				}
			} else {
				System.out.println("Goodbye!");
				System.exit(0);
			}
		} while (!option.equals("-1"));

		input.close();
	}
}
