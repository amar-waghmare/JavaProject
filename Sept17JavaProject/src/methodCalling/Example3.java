package methodCalling;

public class Example3 {

	//static method 
	public static void mul(int x, int y)
	{
		System.out.println(x*y);
	}
	
	//nonstatic method 
	public void test2(String city)
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		Example3.mul(10,50);       // int x = 10

		Example3 obj = new Example3();
		obj.test2("Mumbai");
	}
}
