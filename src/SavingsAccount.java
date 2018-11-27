/**
 * 
 * @author Daniel Han
 * Pd. 7
 */
public class SavingsAccount extends BankAccount
{
	public final double INT_RATE = 0.25;

	public void addInterest()
	{
		deposit(getBalance() * INT_RATE);
	}
}