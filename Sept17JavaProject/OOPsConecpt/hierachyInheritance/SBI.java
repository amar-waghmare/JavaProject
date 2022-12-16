package hierachyInheritance;

public class SBI extends RBI{

	public void personalLoanSBI()
	{
		System.out.println("12% interest from SBI");
	}
	
	public static void main(String args[])
	{
		SBI s = new SBI();
		s.rules();
		s.personalLoanSBI();
	}
}
