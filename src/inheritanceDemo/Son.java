package inheritanceDemo;

public class Son  extends Father{
	
	
	public void fortunerCar ()
	{
		System.out.println("This is son's fortuner car ");
	}
	
	public void ktmBike()
	{
		System.out.println("This is son's ktm bike ");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son () ;
		
		s.ktmBike();    //own 
		
		s.goldWatch();   //father 
		
		s.bicycle();     //father 
		s.fortunerCar();  //own 
				
		Father f = new Father () ; 
	     
	     f.bicycle();         // father's 
	     f.goldWatch();       //father 
	     
	     Daughter d = new Daughter();
	     
	     d.scootyPep();   //daughter
	     d.ladyBird();     //daughter 
	     d.goldWatch();    //father 
	     d.bicycle();      //father 
	    
		
		
	}

}
