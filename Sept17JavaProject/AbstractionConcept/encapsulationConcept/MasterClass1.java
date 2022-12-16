package encapsulationConcept;

public class MasterClass1 {

	public static void main(String[] args) {
		
		StudentDetails s = new StudentDetails();
		s.getAge();
		s.getCity();
		s.getName();
		s.setAge(20);
		s.setName("david");
		s.setCity("Pune");
		s.getAge();
		s.getCity();
		s.getName();
	}

}
