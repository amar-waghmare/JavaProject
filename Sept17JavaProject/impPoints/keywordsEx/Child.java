package keywordsEx;

public class Child extends Parent {

	int a = 20;
	
	public void test1()
	{
		System.out.println("Test1 from child");
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		Child c = new Child();
		c.test1();
		
		c.test1();
	}
}
