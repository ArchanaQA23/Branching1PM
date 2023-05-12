package sample;

public class IfelseIf {
	
	 int weeknum=7;                //variables 
	  public void checkIfelseIf()                              //methods 
	  {
		  if(weeknum==1)
		  {
			  System.out.println("Sunday");
		  }
		  else if (weeknum==2)
		  { 
			  System.out.println("Monday");
		  }
		  else if (weeknum==3)  //3==3
		  {
			  System.out.println("Tuesday");
		  }
		  else if (weeknum==4)
		  {
			  System.out.println("Wednesday");
		  }
		  else if (weeknum==5)
		  {
			  System.out.println("Thursday");
		  }
		  else 
		  {
			  System.out.println("Please provide valid weeknumber ..");
		  }
		  
		  
	  }
	
    public static void main(String args[])
	{
		IfelseIf i = new IfelseIf();    //oc 
		i.checkIfelseIf();                               //mcuo
	}

}
