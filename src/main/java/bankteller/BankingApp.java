package bankteller;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// [X] A Bank object called myBank
		// [?] A BankAccount object called account1 with the following properties ("1111","Checking",500.00)
		// [?] A BankAccount object called account2 with the following properties ("2222","Savings",2500.00)
		// [X] Have myBank add the 2 accounts to the map
		// [] Set up a user interface to give similar output to the console:
		// [] Note: When displaying your accounts use an enhanced for loop
		Scanner input = new Scanner(System.in);

		Bank myBank = new Bank();
		
		myBank.addAccount(new BankAccount ("1111","Checking",500.00));
		myBank.addAccount(new BankAccount ("2222","Savings",2500.00));
		
		System.out.println("Welcome to your BankAccount!");

			System.out.println("BankAccount options:");
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to deposit");  
			System.out.println("Press 2 to withdrawal");
			System.out.println("Press 3 to check balance");
			System.out.println("Press 4 to close an account");
			System.out.println("Press -1 to exit");

			input.close();
		}
	}

