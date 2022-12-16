package operatorsExamples;

public class ComparisonOpEx1 {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 15;
		
		System.out.println(a<b);      // false 
		System.out.println(a>b);      // true 
		System.out.println(a<=b);     // a<b and a==b false 
		System.out.println(a>=b);     // a>b and a==b true 
		System.out.println(a==b);    // false
		System.out.println(a!=b);    // true
	}
}
