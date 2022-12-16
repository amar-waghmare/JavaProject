package operatorsExamples;

public class OperatorsExample1 {

	public void unaryOp()
	{
		int a = 10;
		System.out.println(a++);   // a = 10   >> a = 10+1 = 11
		System.out.println(a--);  //  a = 11   >> a = 11-1 = 10
		System.out.println(++a);  // a = 10+1=11
		System.out.println(--a);  // a = 11-1=10
	}
	
	public void arthemticOp(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	public void conditionalOp(int a, int b)
	{
		System.out.println(a<b);  
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	public void shiftOp(int a, int b)
	{
		System.out.println(a<<b);
		System.out.println(a>>b);
	}
	
	public void logicalOp()
	{
		System.out.println((10>20)&&(10>5));
		System.out.println((10>20)||(10>5));
		
		boolean a = !((10>20)||(10>5));
		System.out.println(a);
	}
	
	public void bitwiseOp()
	{
		System.out.println((10>20)&(10>5));
		System.out.println((10>20)|(10>5));
		System.out.println((10>20)^(10>5));
	}
	
	public static void main(String[] args) 
	{
		OperatorsExample1 obj = new OperatorsExample1();
		obj.unaryOp();
		obj.arthemticOp(20, 10);
		obj.conditionalOp(30, 40);
		obj.shiftOp(10, 2);
		obj.logicalOp();
		obj.bitwiseOp();
	}
}
