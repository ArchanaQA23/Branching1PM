package sample;

public class MethodDemo {
	
	
	public double add (double a , int b  )   // Method name with parameters with return type
	{
		
		return a+b;
	}

	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		double value = m.add(20.9,89);              // Passing the parameters from the method 
		System.out.println(value);
		
		
	}
}
