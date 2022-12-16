package polymorphism1;

public class Sample1 {

	public void test1(byte a)
	{
		System.out.println("byte arg");
	}
	
	public void test1(float b)
	{
		System.out.println("short arg");
	}
	
	public void test1(double c)
	{
		System.out.println("int arg");
	}
	
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		
		s.test1(10);
		

	}

}
