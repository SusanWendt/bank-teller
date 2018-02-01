package bankteller;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {

	@Test
	public void shouldAddAccount() {
		Bank underTest = new Bank();
		BankAccount account = new BankAccount("1234", "savings", 100.00);
		underTest.addAccount(account);
		BankAccount accountTested = (BankAccount) underTest.accounts().toArray()[0];
		Assert.assertSame(account, accountTested); // or could use this assert: Assert.assertEquals(0,
													// underTest.accounts().size());
	}

	@Test
	public void shouldGetAccountByNum() {
		Bank underTest = new Bank();
		BankAccount account = new BankAccount("1234", "savings", 100.00);
		underTest.addAccount(account);
		BankAccount accountTested = underTest.getAccountByAccountNum("1234");
		Assert.assertSame(account, accountTested);
	}

	@Test
	public void shouldRemoveAccount() {
		Bank underTest = new Bank();

		String accountNum = "1234";
		BankAccount account = new BankAccount(accountNum, "savings", 100.00);

		underTest.addAccount(account);
		underTest.close(accountNum);
		BankAccount found = underTest.getAccountByAccountNum(accountNum);
		Assert.assertEquals(null, found);
	}

}