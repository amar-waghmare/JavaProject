package scannerPackage;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		byte a = in.nextByte();
		byte b = in.nextByte();
		
		System.out.println("The value a = " + a);
		System.out.println("The value b = " + b);
		
		System.out.println(a+b);
	}
}
