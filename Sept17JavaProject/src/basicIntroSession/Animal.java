package basicIntroSession;

public class Animal {
	
	//method - specific task 
	public void eat()
	{
		System.out.println("Eatting");
	}
	
	public void run()
	{
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.eat();
		cat.run();

	}

}
