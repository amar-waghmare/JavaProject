package decisionMakingStatement;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		//verify given number is even and odd number
		int num = 874587;
		
		int result = num%2;
		
		if( result == 0)               // 54%2 = 0 >>>   0 == 0
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}

	}

}
