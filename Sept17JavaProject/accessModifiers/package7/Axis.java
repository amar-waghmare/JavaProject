package package7;

public class Axis {
	
	protected int a = 20;
	
	protected Axis()
	{
		System.out.println("Cons");
	}
	
	protected void test()
	{
		System.out.println("method");
	}
	
	public static void main(String args[])
	{
		Axis x = new Axis();
		x.test();
		System.out.println(x.a);
	}

}
