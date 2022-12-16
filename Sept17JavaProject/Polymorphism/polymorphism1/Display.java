package polymorphism1;

public class Display {

	public void test1()
	{
		System.out.println("test1 method without argument");
	}
	
	public void test1(int a)
	{
		System.out.println("test1 method int argument");
	}
	
	public void test1(String n)
	{
		System.out.println("test1 method String argument");
	}
	
	public void test2()
	{
		System.out.println("test2 method without argument");
	}
	
	public void test2(int a)
	{
		System.out.println("test2 method without argument");
	}
	
	public static void main(String args[])
	{
		Display d = new Display();
		d.test1(20);
		d.test1("dfghj");
		d.test1();
		d.test2();
	}
	
}
