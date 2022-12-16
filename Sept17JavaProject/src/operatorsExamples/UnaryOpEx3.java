package operatorsExamples;

public class UnaryOpEx3 {

	public static void main(String[] args) {

		int a = 10;
		System.out.println(a++);  // a = 10 >> a = a+1=10+1 = 11
		System.out.println(++a);  // a = 11 + 1 = 12 >> a = 12
		System.out.println(a--);  // a = 12 >> a = 12-1=11;
		System.out.println(++a);  // a = 11+1 = 12 >> a= 12;
		System.out.println(a++);  // a = 12 >> a = 12+1 = 13
		System.out.println(--a);  // a = 13 - 1 = 12 >> a=12
		
		//10 12 12 12 12 12 
	}
}
