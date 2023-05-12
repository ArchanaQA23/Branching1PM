package constructor;

public class ConstructDemo {
	
	int a ;                               //variable declaration
	public ConstructDemo()                //Constructor 
	{
		this(90,89);
		a=10;                    //initializing the instance variables 
		System.out.println("This is my Default constructor ");
	}
	
	public ConstructDemo(int a ,int b )
	{
		this(90.9,90);
		System.out.println(a+b);
	}
	
	public ConstructDemo(String a, String b)
	{
		System.out.println(a+b);
	}
	
	public ConstructDemo(double a, int b )
	{
		this("Java","Programming");
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		ConstructDemo c = new ConstructDemo();
		
//		ConstructDemo c1 = new ConstructDemo(10,20);
//		ConstructDemo c2 =new ConstructDemo("Java","programming");
//		ConstructDemo c3= new ConstructDemo(90.8,67);
		
		
		
		
	}
	
	
	

}
