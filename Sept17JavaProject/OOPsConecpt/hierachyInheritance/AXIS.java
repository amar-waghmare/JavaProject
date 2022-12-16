package hierachyInheritance;

public class AXIS extends RBI{

	public void personalLoanAxis()
	{
		System.out.println("16% interest from AXIS");
	}
	
	public static void main(String args[])
	{
		AXIS a =new AXIS();
		a.rules();
		a.personalLoanAxis();
	}
}
