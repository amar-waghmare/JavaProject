package generalPackage;

public class Sample2 {
	
	int y = 20;
	
	Sample2()
	{
		System.out.println(y);
	}
	
	Sample2(int a)
	{
		this();
		System.out.println(a);
	}
	

	Sample2(String b)
	{
		this(100);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
//		Sample2 s = new Sample2();	
//		Sample2 s1 = new Sample2(60);
		Sample2 s3 = new Sample2("asdfg");
		
	}

}
