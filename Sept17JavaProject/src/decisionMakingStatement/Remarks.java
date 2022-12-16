package decisionMakingStatement;

public class Remarks {

	public static void main(String[] args) {
//		mark >= 75
//		(mark >=60) && (mark<75) 
//		(mark >=50) && (mark<60)
//		(mark>=35) && (mark<50)
		//fail
		
		int mark = 38;
		if(mark >= 75)
		{
			System.out.println("des");
		}
		else if((mark >=60) && (mark<75))
		{
			System.out.println("first");
		}
		else if ((mark >=50) && (mark<60))
		{
			System.out.println("second");
		}
		else if((mark>=35) && (mark<50))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
