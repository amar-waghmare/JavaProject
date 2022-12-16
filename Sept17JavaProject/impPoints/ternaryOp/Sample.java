package ternaryOp;

public class Sample {

	public static void main(String[] args) {
		
		int age = 15;
		
		String s = (age>18) ? "Eligible" :"Not Eligible";
		System.out.println(s);
		
		
		if (age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}

}
