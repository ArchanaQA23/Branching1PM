package abstraction;

public class DemoBaseClass implements DemoInterface, FatherInterface, MotherInterface {
	
	
	public void audiCar()
	{
		
		System.out.println("Parents Audi Car");
		
	}
	
	
	public void addNumbers()
	{
		System.out.println("Addition of Numbers");
		
	}
	public void subNumbers()
	{
		System.out.println("Subraction of Numbers");
	}
	public void mulNumbers()
	{
		System.out.println("Multiplication of Numbers");
		
	}
	public static void main(String[] args) {
		
		
		DemoBaseClass d = new DemoBaseClass();
		d.addNumbers();//paret inter
		d.subNumbers();//parent inter
		d.mulNumbers();//paret inter
		
		d.audiCar();
		
	}

}
