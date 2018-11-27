/**
 * 
 * @author Daniel Han 
 *PD. 7
 */
public class BankAccount
{
	//fields
	private double balance = 0;
	
	//methods
	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	public void withdrawal(double amt)
	{
		balance = balance - amt;
	}
	public double getBalance()
	{
		return balance;
	}

}

