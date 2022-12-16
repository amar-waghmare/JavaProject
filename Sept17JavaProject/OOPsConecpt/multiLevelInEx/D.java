package multiLevelInEx;

public class D extends C {

	public void method4()
	{
		System.out.println("method4 from D");
	}
	
	
	public static void main(String args[])
	{
		B b = new B();
		b.method1();
		b.method2();
		
		C c = new C();
		c.method1();
		c.method2();
		c.method3();
		
		D d = new D();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
		
	}
}



//D d = new D();
//C c = new C();
//B b = new B();
//A a = new A();
//
//a.method1();
//b.method2();
//c.method3();
//d.method4();
