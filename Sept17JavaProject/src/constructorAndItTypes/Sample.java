package constructorAndItTypes;

public class Sample {
	
	//declaration 
	int a;
	int b;
	
	//initilization
	Sample()
	{
		a = 10;
		b = 20;	
	}
	//usage 
	public void test()
	{
		System.out.println(a+b);
	}
	
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.test();
	}
}
