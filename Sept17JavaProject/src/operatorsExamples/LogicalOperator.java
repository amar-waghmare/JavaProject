package operatorsExamples;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		boolean r1 = (20>30)&&(80>55);   // false && True 
		System.out.println(r1);

		boolean r2 = (20<30)&&(80>55);  // true && true
		System.out.println(r2);
		
		System.out.println((10>20)&&(50>40)&&(60<100)&&(50>25));   // F && T && T && T = F
	
		//---- OR   -  || logical Op
		boolean r3 = (20>30)||(80>55);   // false || True 
		System.out.println(r3);

		boolean r4 = (20<30)||(80>55);  // true || true
		System.out.println(r4);
		
		boolean r5 = (20>30)||(80<55);  // false || false
		System.out.println(r5);
		
		System.out.println((10>20)||(50>40)||(60<100)||(50>25));   // F || T || T || T = T
	
		
		//---- Not   -  ! logical Op
		boolean r6 = !((20>30)||(80>55));   // !(false || True) = ! true = false 
		System.out.println(r6);
		
		
	}

}
