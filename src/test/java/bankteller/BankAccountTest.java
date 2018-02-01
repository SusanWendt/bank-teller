package bankteller;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

	@Test
	public void shouldInitiateBankAccount() {
		BankAccount underTest = new BankAccount(); 
		Assert.assertNotNull(underTest);
	}
	
	@Test
	public void shouldGetBankAccountNum() {
		BankAccount underTest = new BankAccount("1234", "savings", 100.00);
		String result = underTest.getAccountNum();
		Assert.assertEquals("1234", result);
	}
	@Test
	public void shouldGetType() {
		BankAccount underTest = new BankAccount("1234", "savings", 100.00);
		String result = underTest.getType();
		Assert.assertEquals("savings", result);
	}
	@Test
	public void shouldGetBalance() {
		BankAccount underTest = new BankAccount("1234", "savings", 100.00);
		double result = underTest.getBalance();
		Assert.assertEquals(100, result, 0.01);
	}
//	@Test
	
}
