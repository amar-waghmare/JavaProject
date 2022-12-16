package inheritanceEx1;

public class Child extends Parent {

	public void laptop()
	{
		System.out.println("Child's laptop");
	}
	
	public void bike()
	{
		System.out.println("Child's Java Bike");
	}
	
	public static void main(String args[])
	{
		Child c = new Child();
		c.farm();
		c.cars();
		c.bike();
		c.laptop();
		
		Parent.house();
		
		//-------------------------------
		Parent p = new Parent();
		p.farm();
		p.cars();
	}
}
