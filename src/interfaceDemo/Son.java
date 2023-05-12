package interfaceDemo;

public class Son implements Father, GrandFather {
	
	public void audiCar()
	{
		System.out.println("This is son's audi car");
	}

	
	public void goldWatch() {
		
		System.out.println("This is son's gold watch");
	}

	public void bicycle() {
		
		System.out.println("This is son's  bicycle ");
	}
	
	@Override
	public void ambassadorCar() {
	System.out.println("This is son's ambassador car ");
		
	}
	
	
	public static void main(String[] args) {
		
		Son s  = new Son();
		s.bicycle();    // son 
		s.goldWatch();   //son 
		s.audiCar();     //son
		System.out.println(s.wheels);
		
		// s.wheels=9089;   // Static constant , we can't change it 	
		
		
		//Father f = new Father();// we cannot instantiate object for an interface 
		
		
		
		
		
		
		
		
	}


	
	
	

}
