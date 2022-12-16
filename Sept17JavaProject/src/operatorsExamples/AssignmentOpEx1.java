package operatorsExamples;

public class AssignmentOpEx1 {

	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		a += - 3;       // a = a + 3;  a = 20+3 = 23
		System.out.println(a);
		
		a -=50;      // a = a - 50 = 23-50=-27
		System.out.println(a);
		
		a*=20;           // a = a*20 = -27*20 = -540
		System.out.println(a);
		
		a/=30;        // a=a/30 = -540/30 = -18
		System.out.println(a);
		
		//--------------------------
		int b = 30;
		System.out.println(b);
		b<<=3;               // b = b*2^3 = 30 * 8 =240
		System.out.println(b);
		b>>=5;              // b = b/2^5  = 240/32 = 7
		System.out.println(b);
	}

}
