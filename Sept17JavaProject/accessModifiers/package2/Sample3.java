package package2;

import package1.Sample1;
import polymorphism1.Display;

public class Sample3 {

	public static void main(String[] args) {
		
		Sample1 s1 = new Sample1();
		s1.test();
		System.out.println(s1.a);
		
		Display d =new Display();
		d.test1();

	}
}
