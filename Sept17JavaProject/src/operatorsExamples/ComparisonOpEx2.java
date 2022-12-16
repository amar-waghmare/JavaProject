package operatorsExamples;

public class ComparisonOpEx2 {

	public static void main(String[] args) {
		
		double a = 21.2;
		float b = 15.4f;
		
		System.out.println(a<b);      // false
		System.out.println(a>b);      // false
		System.out.println(a<=b);     // a<b or a==b   true
		System.out.println(a>=b);     // a>b or a==b   true
		System.out.println(a==b);    // true
		System.out.println(a!=b);    // false
	}
}
