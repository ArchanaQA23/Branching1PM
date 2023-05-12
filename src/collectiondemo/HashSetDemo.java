package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<Object>   h = new LinkedHashSet<>();
		h.add("Oranium");
		h.add("Chrompet");
		h.add(89090);
		h.add(90.7);
		h.add("Oranium");
		h.add(true);
		h.add(null);
		h.add('7');
		
		System.out.println(h);
		
		boolean contains = h.contains("Oranium");
		System.out.println(contains);
		h.remove(true);
		System.out.println(h);
		//h.clone(); // clone method is there
	// 	h.addAll(h)  // cloning another way using addAll
		
		System.out.println("Converting set into an array for iteration");
		Object[] arr = h.toArray();  // Convertred the set into an array 
		
		for(int i = 0 ;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Using enhanced for loop ");
		for (Object k : h)
		
		{
			System.out.println(k);
		}
		
		System.out.println("using iterator method ");
		Iterator<Object> i = h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next() );
		}
		
		System.out.println("using lambda expresssion..");
        h.forEach(k->System.out.println(k));		
		
		
		
		
	}
	
	

}
