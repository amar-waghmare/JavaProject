package decisionMakingStatement;

public class VerifySalary {

	public static void main(String[] args) {
		int age = 60 ;
		
		if((age>=21)&&(age<=25))
		{
			System.out.println("Salary is 30000");
		}
		else if((age>=26)&&(age<=30))
		{
			System.out.println("Salary is 40000");
		}
		else if((age>=31)&&(age<=35))
		{
			System.out.println("Salary is 50000");
		}
		else if((age>=36)&&(age<=40))
		{
			System.out.println("Salary is 60000");
		}
		else if(age<=20)
		{
			System.out.println("Student");
		}
		else if(age>60)
		{
			System.out.println("Retired");
		}
		else
		{
			System.out.println("Salary is 70000");
		}
	}
}
