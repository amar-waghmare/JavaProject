package operatorsExamples;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		//--- AND Bitwise Operator - &
		System.out.println((10==20)&(10>5));  // F & T >> F
		System.out.println((40>30)&(10!=50)); // T & T >> T 
		
		//---OR  Bitwise Operator   | 
		System.out.println((30==20)|(10>5));  // F | T  >> T
		System.out.println((20>30)|(10!=50)); // F | T  >> T
		
		//--- XOR Bitwise Operator ^ 
		System.out.println((40>30)^(10!=50)); // T ^ T >> F
		System.out.println((40<30)^(10!=50)); // F ^ T >> T
		System.out.println((40<30)^(10!=50)^(100>80));  // F ^ T ^ T >> F ^ F  >> F
	}
}
