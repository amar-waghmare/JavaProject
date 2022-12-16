package stringExample1;

public class Example8 {

	public static void main(String[] args) {
		
		// String to int 
		String a = "1234";
		String b = "1234";
		
		System.out.println(a+b);
		
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		System.out.println(a1+b1);
		
		// int to string 
		int x =10;
		int y = 20;
		System.out.println(x+y);
		String x1=String.valueOf(x);
		String y1=String.valueOf(y);
		
		System.out.println(x1+y1);
		
		
	}
}
