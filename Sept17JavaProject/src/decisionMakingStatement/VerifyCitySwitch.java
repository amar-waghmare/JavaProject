package decisionMakingStatement;

public class VerifyCitySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "Hyderbad";
		
		switch(city)
		{
			case "Pune": System.out.println("I am from Pune"); break;
			case "Nagpur": System.out.println("I am from Nagpur"); break; 
			case "Mumbai": System.out.println("I am from Mumbai"); break;
			case "Delhi": System.out.println("I am from Delhi"); break;
			default : System.out.println("Other City");
		}
	}
}
