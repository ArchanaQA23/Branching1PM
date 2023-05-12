package sample;

public class ArrayDemo {
	int arr[]  =  {10,20,30,40,50,60};
	
	public void checkArray()
	{
		
//		System.out.println(arr[2]);
//		System.out.println(arr[5]);
		System.out.println(arr.length);   //6
		
		for(int i =arr.length-1;i>=2;i--)
		{
			System.out.println(arr[i]);
		}
		
	   System.out.println("Using enhanced for loop ");
		//forward --> unidirectional loop 
		for (int k:arr)
		{
			System.out.println(k);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayDemo a = new ArrayDemo ();
		a.checkArray();
	}

}
