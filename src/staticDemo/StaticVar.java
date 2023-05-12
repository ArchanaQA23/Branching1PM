package staticDemo;

public class StaticVar {
	
	static int a = 10;    // static variable 
	
	public static void display()    //static method 
	{
		System.out.println("Hello ");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(StaticVar.a);   //static varaible called 
		
		StaticVar.display();   //static method call 
		
	}

}
