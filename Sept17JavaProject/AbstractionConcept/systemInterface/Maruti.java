package systemInterface;

public class Maruti implements Car {

	@Override
	public void start() {
		System.out.println("Start");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
		
	}

	@Override
	public void wheels() {
		System.out.println("Wheels");
		
	}

	@Override
	public void colour() {
		System.out.println("Red Colour");
		
	}
	
	public static void main(String args[])
	{
		Maruti m = new Maruti();
		m.start();
		m.stop();
		m.wheels();
		m.colour();
	}

}
