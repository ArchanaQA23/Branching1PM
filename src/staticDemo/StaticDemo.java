  package staticDemo;

public class StaticDemo {
	
	int id ;
	String name ;
	static String cname ="SRM";
	
	
//	static                  //static block 
//	{
//		cname ="SRM";
//	}
	
	
	public void display(int a , String n, String c)
	{
		
		id=a;
		name=n;
		cname=c;
		
		System.out.println("Name of the student is:" + name);
		System.out.println("Id of the student is: " +id);
		System.out.println("College name is : " +cname );
		System.out.println("======================");
		 
	} 
	
	public static void main(String[] args) {
		
		StaticDemo s = new StaticDemo();
		s.display(456, "raj",cname);    // 4   10   10 
		s.display(890, "Ram",cname);    //4     10   10 
		s.display(890,"Janu",cname);     //4    10   10 
		
	}

}
