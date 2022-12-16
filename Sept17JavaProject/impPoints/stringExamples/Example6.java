package stringExamples;

public class Example6 {

	public static void main(String[] args) {
		
		String s1 = "Harry Potter";
		
		String s2 = "Harry Potter";
		
		String s3 = new String("Harry Potter");
		
		String s4 = new String("Harry Potter");
		
		
		boolean a = s3==s4;
		System.out.println(a);
		
		boolean b = s3.equals(s4);
		System.out.println(b);
		
		
//		== >> values 
//		equals >> ref obj 
	}
}
