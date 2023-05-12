package collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
		h.put("English", 90);           
		h.put("Science",90);
		h.put(null, 90);
		h.put("English", 89);
		h.put("computer", 78);
		
		
		System.out.println(h);
		System.out.println("Iterating all the keys using keySet() method ");
		Set<String> k= h.keySet();
		
		for(String a: k)
		{
			System.out.println(a);
		}
		
		System.out.println("Iterating all the values using values() method ");
		Collection<Integer> v = h.values();
		
		for(Integer l : v) {
			System.out.println(l);
		}
		
		
		Set<Entry<String, Integer>> s = h.entrySet();
		
		for(Entry<String,Integer> e: s)
		{
			
			
			System.out.println(e);
		}
		
		
		System.out.println("Get only the value of Computer");
		
		for(Entry<String,Integer> l:s)
		{
			if(l.getKey()=="computer")
			{
				System.out.println(l.getValue());
			}
		}
			
		
		
	}
}
