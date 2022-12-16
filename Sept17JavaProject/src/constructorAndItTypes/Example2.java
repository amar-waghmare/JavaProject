package constructorAndItTypes;

public class Example2 {
	
	int x;
	
	public void test(int y)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		Example2 y = new Example2();
		y.test(10);
	}
}
