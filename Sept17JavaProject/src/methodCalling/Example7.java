package methodCalling;

public class Example7 {

	public static void sample2(int b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		Example7.sample2(10);
		
		
		Example6.sample1(50);
		
		Example6 obj= new Example6();
		obj.test10(10.2, 20.2);

	}

}
