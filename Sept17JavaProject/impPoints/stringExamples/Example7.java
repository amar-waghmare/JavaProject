package stringExamples;

public class Example7 {

	public static void main(String[] args) {
		
		String s1 = "Harry Potter";
		
		String s2 = "HARRY POTTER";   
		
		boolean a = s1==s2;
		System.out.println(a);
		
		boolean b = s1.equalsIgnoreCase(s2);
		System.out.println(b);
		
		
	
	}

}
