package nonPrimitiveCasting;

public class Child extends Parent{

	public void bike()
	{
		System.out.println("bike Child");
	}

	public void mobile()
	{
		System.out.println("mobile Child");
	}
	
	public static void main(String args[])
	{
		Parent p = new Parent();
		
		Child c = (Child)p;
		
		c.farm();
		c.car();
		c.bike();
		c.mobile();

	}
}

//
//c.farm();
//c.car();
//c.bike();
//c.mobile();



////----- Upcasting ----
//Child c = new Child();
////Parent p = new Parent();
//Parent p = c;
//p.farm();
//p.car();
