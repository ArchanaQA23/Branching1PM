package finalKeyword;

public final class FinalDemo {
	
	
	final int a = 9089;
	
	public final void dis()
	{
		System.out.println("Heloo ");
	}
	
	
	public static void main(String[] args) {
		
		
		FinalDemo f = new FinalDemo();
		
		System.out.println(f.a);
		//f.a=9090;   not possible to change 
		
		f.dis();
	}

}
