package abstraction;

public class DemoChild extends SampleAbstractClass {



	public void demoSampleThree()
	{
		System.out.println("Demo Sample Three");
	}

	public void demoSampleFour()
	{
		System.out.println("Demo Sample Four");

	}
	
	
	public static void main(String[] args) {
		
		DemoChild d = new DemoChild();
		d.demoSampleThree();
		
		d.demoSampleFour();
		
	}


}
