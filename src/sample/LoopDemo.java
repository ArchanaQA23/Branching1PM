package sample;

public class LoopDemo {
	
	public void checkForLoop()
	
	{
  
     for(int num=1; num<=100; num++)    //2   2<=100
     {
    	 if(num%2==0)              // 2%2==0
    	 {
    		 System.out.println(num + " is an even number");
    	 }
    	 else
    	 {
    		 System.out.println(num + " is an odd number");
    	 }
    	
     }
	}
	
	public static void main(String[] args) {
		
		LoopDemo l = new LoopDemo();
		l.checkForLoop();
		
	}

}



