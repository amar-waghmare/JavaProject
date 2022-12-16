package constructorAndItTypes;

public class Example8 {
	
	Example8()
	{
		System.out.println("Constructor without argument");
	}
	
	Example8(int a,int b,String c)
	{
		System.out.println("Constructor with argument 2 int and one string");
	}
	
	Example8(int b)
	{
		System.out.println("Constructor with argument 1 int");
	}
	
	public static void main(String args[])
	{
		Example8 o1 = new Example8();
		Example8 o2 = new Example8(20,10,"Kali");
		Example8 o3 = new Example8(20);
	}
}
