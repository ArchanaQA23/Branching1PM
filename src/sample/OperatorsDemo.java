package sample;

public class OperatorsDemo {
	
	int a =10,b =20;
	
	public void shortHandOps()
	{
//		    a=a+b;    // a=a+b;
//     System.out.println(a);
     
     System.out.println(a++);
    System.out.println("Welcome"+"JAVA");
    
	}

	public static void main(String args [] )
	{
		
	OperatorsDemo o = new OperatorsDemo();    //object created 
	o.shortHandOps();								//method call using object 
	System.out.println(o.a);
	}

}
