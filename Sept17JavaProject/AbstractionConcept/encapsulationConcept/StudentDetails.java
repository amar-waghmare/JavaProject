package encapsulationConcept;

public class StudentDetails {
	
	private int age;
	private String name; 
	private String city;
	
	//Setter method
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	
	//getter methods 
	public void getAge()
	{
		System.out.println("Student age is ="+age);
	}
	
	public void getName()
	{
		System.out.println("Student name is ="+name);
	}
	
	public void getCity()
	{
		System.out.println("Student City is ="+city);
	}

}
