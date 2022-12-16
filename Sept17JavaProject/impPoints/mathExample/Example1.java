package mathExample;

public class Example1 {

	public static void main(String[] args) {
		
		double a = Math.max(10.5, 20);
		double b = Math.max(a, 30);
		System.out.println(b);
		
		int a1 = Math.min(10, 20);
		System.out.println(a1);
		
		//cube root 
		double a2=Math.cbrt(100);
		System.out.println(a2);
		
		//square root 
		double a3 = Math.sqrt(200);
		System.out.println(a3);
		
		double a4=Math.pow(10, 3);
		System.out.println(a4);
		
		double a5 = Math.E;
		System.out.println(a5);
	}

}
