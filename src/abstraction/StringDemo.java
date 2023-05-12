package abstraction;

public class StringDemo {
	
	public static void main(String[] args) {
		String s ="Welcome Java Programming OOP concpet";
		
		String[] split = s.split(" ");
		String revword ="";
		for(int i =0;i<split.length;i++)
		{
			
			if(i%2==0)
			{
		
			String word =" "+split[i];
			
			char[] character = word.toCharArray();
			
			for (int k =character.length-1;k>=0;k--)
			{
				revword = revword+character[k];
			}
			}
			else
			{
				revword=revword+split[i]+" ";
			}
		
	}
		System.out.println(revword );
	}
}
