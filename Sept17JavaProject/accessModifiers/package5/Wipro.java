package package5;

public class Wipro {
	
	double y = 20.50;
	
	int z =20;
	
	void test()
	{
		System.out.println("test method");
		int a =30;
	}
	
	Wipro()
	{
		System.out.println("test cons");
	}
	
	public static void main(String args[])
	{
		Wipro w = new Wipro();
		w.test();
		System.out.println(w.y);
	}

}
