package constructorAndItTypes;

public class Example7 {
	
	Example7()
	{
		System.out.println("Constructor without argument");
	}
	
	Example7(int a)
	{
		System.out.println("Constructor with argument");
	}
	
	public static void main(String args[])
	{
		Example7 o1 = new Example7();
		Example7 o2 = new Example7(10);           // int a = 10
	}
	

}
