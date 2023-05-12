package collectiondemo;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet <Object> t =  new TreeSet <>();
		
		t.add("Oranium");
		t.add("tech");   
		t.add("chrompet");
		//t.add(null);   //Null pointer Exception will get occur 
		
		System.out.println(t);   // [Oranium, chrompet, tech]
		
	}

}
