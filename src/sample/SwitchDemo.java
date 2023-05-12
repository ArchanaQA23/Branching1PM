package sample;

public class SwitchDemo {
	
	String proof ="pan";
	int mark =89;
	char c ;
	
	public void checkSwitch()
	{
		if(mark>80)
		{
			
			c='A';
		}
		
		else if (mark>70 && mark <=80)
		{
			c='B';
		}
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		SwitchDemo s = new SwitchDemo();
	    s.checkSwitch();
		
	}

}
