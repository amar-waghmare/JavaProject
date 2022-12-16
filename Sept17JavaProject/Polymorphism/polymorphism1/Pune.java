package polymorphism1;

public class Pune extends Mumbai {

	public void vadapav()
	{
		System.out.println("Vadapav Pune");
	}
	
	public void bollywood(String n)
	{
		System.out.println("Bollywood Pune");
	}
	
	public static void main(String args[])
	{
		Pune p = new Pune();
		p.vadapav();
		p.bollywood("sdfg");
		p.tajHotel();
		
		Mumbai m = new Mumbai();
		m.vadapav();
		m.bollywood("gfdsdf");
		m.tajHotel();
	}
}
