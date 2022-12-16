package ternaryOp;

public class Sample3 {

	public static void main(String[] args) {
		
		// verify greatest number from below 
		
		int a = 20;
		int b = 300;
		int c = 40;
		
		int result = (a>b)?   ((a>c)?a:c)   :   ((b>c)?b:c);
		System.out.println(result);
		
		
		
		
		
	}
}
