package mathExample;

public class Example3 {

	public static void main(String[] args) {
		
		// area of the circle 
		// area = pi*r^2;
		double area ;
		double r = 10.2;
		
		area = Math.PI* r*r;
		double area1 = Math.PI* Math.pow(r, 2);
		System.out.println(area);
		System.out.println(area1);
		
		
		// c = 2pir 
		double c = 2*Math.PI*r;
		System.out.println(c);
	}

}
