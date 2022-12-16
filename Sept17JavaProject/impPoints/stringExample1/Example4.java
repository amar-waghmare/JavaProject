package stringExample1;

public class Example4 {

	public static void main(String[] args) {
		
		
		String s3="My name is an David Warner";
		
		boolean a = s3.endsWith("n");
		System.out.println(a);
		
		int b = s3.indexOf('i');
		System.out.println(b);
		
		int c = s3.indexOf('n',4);
		System.out.println(c);
		
		int d = s3.indexOf("Warner", 2);
		System.out.println(d);
		
		
	}

}
