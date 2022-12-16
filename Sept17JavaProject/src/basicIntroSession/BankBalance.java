package basicIntroSession;

public class BankBalance {
	
	private double balance = 20;
	
	public void setBankBalance(double balance1)  // 100 
	{
		balance = balance + balance1;   // = 20 + 100 = 120
	}
	
	public double getBankBalance()
	{
		return balance;
	}
}
