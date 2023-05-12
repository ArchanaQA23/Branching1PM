package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		LinkedList <Object> a = new LinkedList<>();
		a.add("Oranium");
		a.add("Tech");
		a.add("Oranium");
		a.add(89.0);
		a.add(78);
		a.add(null);
		a.add(true);
		a.add('y');
		
		System.out.println(a);
		
		System.out.println(a.get(4));  //78
		
		System.out.println(a.indexOf(null));  //5 
		
		System.out.println(a.lastIndexOf("Oranium"));   //2
		
		System.out.println(a.contains("Oranium"));  //true
		
		int size = a.size();
		System.out.println(size);  //8 
		
		a.set(2, "Chrompet");
		System.out.println(a);
		
		a.remove(6);
		System.out.println(a);
		
		a.remove(null);
		System.out.println(a);   // [Oranium, Tech, Chrompet, 89.0, 78, y]
		
		System.out.println("Using normal for loop ");
		
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("Using enhanced for loop ");
		
		for (Object k:a)
		{
			System.out.println(k);
		}
		
		System.out.println("Using iterator method ..");
		Iterator<Object> i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("Using lambda expression ");
		
		a.forEach(k->System.out.println(k));
		
		
		LinkedList<Object>  b = new LinkedList<>();
		b= (LinkedList<Object>) a.clone();
		
		System.out.println(b);
		
		LinkedList<Object>  c = new LinkedList<>();
		
		c.addAll(a);
		
		System.out.println(c);
		
		b.clear();
		c.clear();
		
		System.out.println(b);  // []
		 
		System.out.println(c);  // []
		
		
		
		
		
		
		
	}

}
