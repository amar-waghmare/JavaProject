package stringExample1;

public class Example3 {

	public static void main(String[] args) {
		
		String s1 = "Harry Potter";
		String s2 = "James Potter";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		String s3="My Name is Khan";
		boolean a = s3.contains("asdfg");
		System.out.println(a);
		
		boolean b = s3.contentEquals("My Name is Khan");
		System.out.println(b);

	}

}
