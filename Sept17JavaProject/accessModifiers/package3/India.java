package package3;

public class India {
	
	private int x = 20;
	
	private void test()
	{
		System.out.println("test private method");
	}
	
	 India()
	{
		System.out.println("test private cons");
	}
	
	public static void main(String args[])
	{
		India o = new India();
		o.test();
		System.out.println(o.x);
	}

}
