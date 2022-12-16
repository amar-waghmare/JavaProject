package methodCalling;

public class Example2 {

	//static method
	public static void test1(int a,int b)     // int a = 10   b = 20
	{
		System.out.println(a+b);
		System.out.println(a-b);
	}
	
	//nonstatic method 
	public void test2(float b, int c)
	{
		System.out.println(b*c);
		
	}
	
	public static void main(String[] args) {
		
		Example2.test1(50,100);         // int a = 10 , int b = 20
		Example2.test1(200, 100);
		
		Example2 obj = new Example2();
		obj.test2(10.5f, 50);
	}

}
