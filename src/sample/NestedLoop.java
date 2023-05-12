package sample;

public class NestedLoop {
	
	public void checkStarPattern()
	{
		for (int row =1;row<=5;row++)        // row =3   2<=5
		{
			for(int col=1; col<=5;col++)     //col=1    1<=5
			{
				if(row==1 ||row==5 ||col==1||col==5)
				{
				System.out.print("* ");       
			}
				else
				{
					System.out.print("  ");
				}	   
		}
			System.out.println();  //It will bring down the control to your next line 
		}
	}
	
	
	public static void main(String[] args) {
		NestedLoop n = new NestedLoop ();
		n.checkStarPattern();
		
	}

}
