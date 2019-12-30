package utils;

import java.util.HashSet;


public class HashSetExample {
	public static void main(String[] args) {
	
			HashSet items=new HashSet<>();
			items.add("xyz");
			items.add(123);
			items.add("pqr");
			items.add("pqr");
			items.add("sql");
			items.add(256);
			items.add(null);
			System.out.println(items);
		
	}

}
