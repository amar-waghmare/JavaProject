package polymorphism1;

public class University {

	public void test()
	{
		System.out.println("test method without argument");
	}
	
	public void test(int a)
	{
		System.out.println("test method int argument");
	}
	
	public static void main(String[] args) {
		
		University obj = new University();
		obj.test();
		obj.test(10);
	}
}
