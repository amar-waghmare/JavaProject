package myPackage;

public abstract class Car {

	Car()
	{
		
	}
	
	public abstract void start();
	
	public abstract void stop();
	
	public void wheels()
	{
		System.out.println("4 wheels");
	}
	
	public void exterior()
	{
		System.out.println("exterior");
	}
	
	public static void test()
	{
		System.out.println("Static method");
	}
	
	public final void test1()
	{
		
	}
	
	public static void main(String args[])
	{
//		Car c = new Car();
		Car.test();
	}
	
}
