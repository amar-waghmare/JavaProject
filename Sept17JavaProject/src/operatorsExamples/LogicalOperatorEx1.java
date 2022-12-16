package operatorsExamples;

public class LogicalOperatorEx1 {

	public static void main(String[] args) {
		
		
		boolean a = (10>5)&&(50>40)||(40<30)&&(60>80)||(90>100);  
		 // T && T || F && F || F  
		 // T || F && F || F 
		 // T && F || F 
		 // F || F 
		 // F
			
		System.out.println(a);

	}
}
