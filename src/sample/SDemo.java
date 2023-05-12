package sample;

public class SDemo {
	
	public static void main(String[] args) {
		
		String s = "oranium";
		String s2="oranium";
		
		
		String s1 = new String("oranium");
		
		// equals --> content comparison 
		
		System.out.println(s.equals(s1));
		
		// ==      ---> Address comparision of the string 
		
		System.out.println(s==s1);    
		
		System.out.println(s==s2);  //true  // Since both address pointing same,we got true 
		
		System.out.println(s.hashCode() + " " +s2.hashCode());  // -1209620111 -1209620111
		
	}
	

}
