package finalKeywordEx;

final class Display {

	final int a = 20;
	
	final  void test()
	{
//		a = 30;
		System.out.println(a);
	}
	
	public void test(int x)
	{
		System.out.println(a+x);
	}
	
	public static void main(String args[])
	{
		Display d = new Display();
		d.test();
		d.test(10);
	}
	
	
	
	
	
	
}
