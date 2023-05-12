package sample;

public class JumpingStatement {
	
	public void checkJump()
	{
		for(int num =1 ; num<=10; num++)
		{
			
			if(num==7 )     //5==5
			{
				break;                  //Its skipping the current iteration
			}
			System.out.println(num);    //2
		}
	}
	
	
	public static void main(String[] args) {
		JumpingStatement j = new JumpingStatement();
		j.checkJump();
		
	}

}
