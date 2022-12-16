package basicConcepts;

public class Animal {

	public void eat()
	{
		System.out.println("Eatting method");
	}
	
	public void walk()
	{
		System.out.println("Walking method");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping method");
	}

	public static void main(String[] args) 
	{
		Animal dog = new Animal();
		dog.eat();
		dog.sleep();
		dog.walk();
	}
}
