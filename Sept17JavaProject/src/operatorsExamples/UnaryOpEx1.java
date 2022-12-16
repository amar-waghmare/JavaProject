package operatorsExamples;

public class UnaryOpEx1 {

	public static void main(String[] args) {
		
		int x = 20;
		System.out.println(x);
		
		// ++ >> increment by 1 
		// -- >> decrement by 1
		
		x++;                   // x = x +1 = 20+1 = 21
		System.out.println(x);  //21 
		x++;
		System.out.println(x);  //22
		
		//------------------------
		x--;
		System.out.println(x);   //21
		x--;
		System.out.println(x);   //20
	}
}
