package sample;

public class StringDemo {
	
	String s ="oranium";
	String s1="ORANIUM";
	
	String s2="  WELCOME GUYS          ";
	
	String s3 ="Java programming for 10AM Batch";
	String s4="oranium";
	
	String s5= new String("oranium");
	
	public void checkString()
	{
      
     System.out.println(s.equals(s4));
     System.out.println(s.equals(s5));
     
     System.out.println(s==s4);
     System.out.println(s==s5);
     
     System.out.println(s2==s3);
	}

	
	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		sd.checkString();
		
	
	}
	
}
