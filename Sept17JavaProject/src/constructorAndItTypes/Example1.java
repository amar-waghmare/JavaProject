package constructorAndItTypes;

public class Example1 {

	int a;  //declaration
	
	public void test()
	{
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Example1 x = new Example1();
		x.test();
	}
}
