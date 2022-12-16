package variableTypes;

public class GlobalExample1 {
	
	int a = 100;
	
	public void test1()
	{
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void test2()
	{
		int m = 30;
//		int n = a +m;       // we cannot access global in static method 
	}
	
	public static void main(String args[])
	{
		GlobalExample1 g = new GlobalExample1();
		g.test1();
		
		int x = 10;
		int y = x + g.a;
		
		System.out.println(y);
	}

}
