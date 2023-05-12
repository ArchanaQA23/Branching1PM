package polymorphism;

public class Son  extends Father{

	
	public void audiCar()
	{
		System.out.println("This is son's audi car ");
	}
	
	public void fortunerCar()
	{
		System.out.println("This is son's fortuner car ");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();   
		s.audiCar();
		s.fortunerCar();  
		s.bicycle();   
		
		
		Father f = new Father();
		f.bicycle();  //father 
		f.fortunerCar();  //father 
		
		Father f1=new Son();    //Upcasting 
		f1.bicycle(); 
		f1.fortunerCar();  //overriden method of son will be called . 
		//f1.audiCar();      //not possible 
	}

}
