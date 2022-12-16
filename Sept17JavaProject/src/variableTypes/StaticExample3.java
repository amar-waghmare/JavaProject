package variableTypes;

public class StaticExample3 {
	
	static short a = 100;
	static short b = 200;
	
	public void test1()
	{
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		StaticExample3 abc = new StaticExample3();
		abc.test1();
	}
}
