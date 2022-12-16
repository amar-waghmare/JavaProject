package aaa;

public class Atwo {

	private void test2()
	{
		System.out.println("private method");
	}
	
	
	public static void main(String args[])
	{
		Aone a= new Aone();
		a.test1();
		
		System.out.println(a.num1+a.num2);
	}
}
