package stringExample1;

public class Example1 {

	public static void main(String[] args) {
		
		
		String s1 = "Harry ";
		String s2 = "Potter ";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));   
		
		//0         --- both same 
		// +        --- s1>s2
		// -        --- s1<s2
		
		String a = "ABCD";
		String b = "abcd";
		
		System.out.println(a.compareTo(b));

	}

}
