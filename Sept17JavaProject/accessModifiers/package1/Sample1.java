package package1;

public class Sample1 {

	public int a = 20;

	public void test()
	{
		System.out.println("Test method");
	}
	
	public Sample1()
	{
		System.out.println("Sample1 const");
	}
	
	public static void main(String args[])
	{
		Sample1 obj = new Sample1();
		obj.test();
		System.out.println(obj.a);
	}
}
