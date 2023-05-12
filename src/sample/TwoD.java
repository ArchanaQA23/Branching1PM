package sample;

public class TwoD {
	
	int tarr[] []  = { { 10,20,30},
			
						{40,50,60,89},
						{70,80,90 }
						
	};
	
	public void checkTwo()
	{
		System.out.println(tarr.length);   //3   Return number of rows
		System.out.println(tarr[1].length);   //4  Return number of columns 
		
		for (int row =0;row<tarr.length;row++)
		{
			for(int col = 0 ; col<tarr[row].length;col++)
			{
				System.out.print(tarr[row][col]+ " ");
			}
			System.out.println();
				
		}
		
		System.out.println("using enhanced for loop ");
		
		// 
//		int tarr[] []  = { { 10,20,30},
//				
//				{40,50,60,89},
//				{70,80,90 }   
//				
		 
		for (int[] k:tarr )
		{
			for(int j:k)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	

	public static void main(String[] args) {
		TwoD d = new TwoD();
		d.checkTwo();
		
		
	}

}
