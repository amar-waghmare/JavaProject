package scannerPackage;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		System.out.println("The given number ="+num);
		
		int rem;
		int x=0;
		
		while(num>0)
		{
			rem = num%10;
			x = x*10+rem;
			num = num/10;
		}
		
		System.out.print("The reverse number="+x);
	}
}
