package polymorphism;

public class MethodOverloadDemo {
	
	public void add ()
	{
		int a =90,b =80;
		System.out.println(a+b);
	}
	
	public int  add(int a , int b )
	{
		return a+b ;
	}
	
	public int  add(int a, int b ,int c )
	{
		return a +b+c;
	}
	
	
	public void add(String a,String b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,double b )
	{
		System.out.println(a+b);
	}
	
	public double add(double a ,int  b )
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		MethodOverloadDemo  m= new MethodOverloadDemo ();
		m.add();
		System.out.println(m.add(20, 89));
		System.out.println(m.add(30,90,89));
		m.add("Java","Programming ");
		m.add(90,89.8);
		System.out.println(m.add(90.7,45));
		
		
	
	}

}
