package variableTypes;

public class LocalExample1 {
	
	public void maharashtra()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void goa()
	{
		int c = 20;
		int d = 5;
		int e = d-c;
		System.out.println(e);
	}
	
	public static void main(String args[])
	{
		int x = 20;
		System.out.println(x);
		LocalExample1 xyz = new LocalExample1();
		xyz.maharashtra();
		xyz.goa();
	}
	

}
