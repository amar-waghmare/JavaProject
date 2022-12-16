package encapsulationConcept;

public class BankAccount {
	
	private double balance = 20000;
	
	
	public void getBalance()
	{
		System.out.println("My account balance is = "+ balance);
	}
	
	public void updatedBalance(double b)
	{
		balance = balance+b;
	}

}
