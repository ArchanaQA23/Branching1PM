package abstraction;

public class OverloadDemo {
	
	
	int a =10;
	int b=20;//gloabl variable
	
	public void printNumber()
	{
		
		System.out.println(a+b);
	}
	
	public void printNumber(int a, int b)// local variable
	{
		
		System.out.println(a-b);
	}
	
	public void printNumber(float a, int b)
	{
		System.out.println(a*b);
		
	}
	
	public void printNumber(int a, float b)
	{
		
		
		System.out.println(a/b);
	}
	
	
	
	public static void main(String[] args) {
		
		
		OverloadDemo o = new OverloadDemo();
		o.printNumber();
		o.printNumber(50, 40);
		o.printNumber(40.34f, 30);
		o.printNumber(40, 40.34f);
		
	}
	

}
