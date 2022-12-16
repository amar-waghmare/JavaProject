package variableTypes;

public class StaticExample5 {
	
	static int a = 100;
	
	public void test1()
	{
		int b = 200;
		int c = a+b;
		System.out.println(c);
	}

	public static void test2()
	{
		int m = 500;
		int n = m-a;
		System.out.println(n);
	}
	
	public static void main(String args[])
	{
		StaticExample5 s = new StaticExample5();
		s.test1();
		
		StaticExample5.test2();
	}
}
