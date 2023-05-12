package sample;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "oranium";
		String revstr="";
		
		char[] charArray = s.toCharArray();
		
		System.out.println(s.length());    // 7 
		
		for (int i =s.length()-1;i>=0;i--)  // 5    5>=0
		{
			revstr=revstr+s.charAt(i);   //revstr =   mu
		}
		
	
		
		System.out.println(revstr);   // muinaro
		
	}

}
