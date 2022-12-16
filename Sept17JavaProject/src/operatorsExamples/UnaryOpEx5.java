package operatorsExamples;

public class UnaryOpEx5 {

	public static void main(String[] args) {
		
		
		// a++ a--  >> postfix   >> print + operation 
		// ++a --a  >> prefix    >> Operation + print 
		
		//25 25 27 27 27 28 27 27 29 29 
		
		int x = 25;
		System.out.println(x);      // x = 25 
		System.out.println(x++);    // x = 25   --- x=25+1=26  
		System.out.println(++x);    // x = 26+1=27 ---- x = 27
		System.out.println(x++);    // x = 27    ---- x = 27+1=28
		System.out.println(--x);    // x=28-1 = 27 --- x = 27
		System.out.println(++x);    // x=27+1 = 28 ---- x =28
		System.out.println(--x);    // x=28-1=27   ---- x=27
		System.out.println(x++);    // x = 27 ---- x=27+1=28
		System.out.println(++x);    // x=28+1=29 ---- x = 29
		System.out.println(x++);    // x=29     ---- x=29+1=30

	}

}
