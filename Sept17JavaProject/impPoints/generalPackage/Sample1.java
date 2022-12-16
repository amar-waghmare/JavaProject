package generalPackage;

public class Sample1 {
	
	int x = 10 ;
	int y = 50;
	
	Sample1(int x)
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public void test(int x)
	{
		System.out.println(this.x);
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		
		Sample1 s = new Sample1(20);
		s.test(30);
		
	}
}
