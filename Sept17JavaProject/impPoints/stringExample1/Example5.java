package stringExample1;

public class Example5 {

	public static void main(String[] args) {
		
		
		String s3="My name is an David Warner";
		
		int a = s3.lastIndexOf('a');
		System.out.println(a);
		
		String b = s3.repeat(2);
		System.out.println(b);
		
		String c = s3.replace('a', 'z');
		System.out.println(c);
		
		String d = s3.replace("Warner", "Miller");
		System.out.println(d);
		
		String e = s3.replaceAll("is", "was");
		System.out.println(e);
	}

}
