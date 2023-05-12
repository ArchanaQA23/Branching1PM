package abstraction;

public class Daughter extends Father{

	
	public void scootyPep() {
		
		System.out.println("This is daughter's scootypep ");
	}

	@Override
	public void goldWatch() {
		System.out.println("This is daughter's gold watch ");
		
	}
	
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.scootyPep();
		d.goldWatch();
		d.audiCar();
		
		// Father f = new Father();  // We can't create an object for abstract class 
	}
	
	
}
