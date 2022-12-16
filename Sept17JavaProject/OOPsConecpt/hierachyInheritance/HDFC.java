package hierachyInheritance;

public class HDFC extends RBI{

	public void personalLoanHDFC()
	{
		System.out.println("13% interest from HDFC");
	}
	
	public static void main(String args[])
	{
		HDFC h = new HDFC();
		h.rules();
		h.personalLoanHDFC();
	}
}
