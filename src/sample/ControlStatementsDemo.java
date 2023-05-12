package sample;

public class ControlStatementsDemo {
	
    int num =20;
    
    public void checkNestedIf()
    {
       if(num%2==0)        //32 %2 ==0
       {
    	   System.out.println(num +"is completely divisble by 2 ");
    	   if(num%4==0)      // 
    	   {
    		   System.out.println(num +"is completely divisble by 4 ");
    		   if(num%8==0)
    		   {
    			   System.out.println(num +"is completely divisble by 8 ");
    			   if(num%16==0)
    			   {
    				   System.out.println(num +"is completely divisble by 16 ");
    			   }
    		   }
    	   }
       }
    	
       System.out.println(1);
       System.out.println(2);
    	
    }
    
    public static void main(String[] args) {
    	
    	ControlStatementsDemo c = new ControlStatementsDemo();  //oc 
    	c.checkNestedIf();                    //method call using object 
		
	}

}
