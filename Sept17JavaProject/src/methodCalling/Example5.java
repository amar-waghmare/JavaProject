package methodCalling;

public class Example5 {

	public static void test3()
	{
		System.out.println("Test3 method from Example5");
	}
	
	public static void main(String[] args) {
		Example5.test3();
		Example4.test1();

		Example4 xyz = new Example4();
		xyz.test2();
		
		Example1 x = new Example1();
		x.test2();
		Example1.test1();
	}
}
