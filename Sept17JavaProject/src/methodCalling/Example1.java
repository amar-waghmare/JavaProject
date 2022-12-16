package methodCalling;

public class Example1 {

	//static method
	public static void test1()
	{
		long a = 500000l;
		long b = 40000l;
		long c = a+b;
		System.out.println(c);
	}
	
	//nonstatic method 
	public void test2()
	{
		String x = "Facebook helps you connect and share with the people in your life.";
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		Example1.test1();
		Example1 obj = new Example1();
		obj.test2();
		
		obj.test1();
		test1();
	}
}
