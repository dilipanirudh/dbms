package utils;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(567);
		list.add(34.56);
		list.add("deloitte");
		list.add(567);
		list.add(null);
		System.out.println(list+" "+list.size());
		list.add("hyd");
		list.add(2, "java");
		System.out.println(list+" "+list.size());
		list.remove(new Integer(567));
		System.out.println(list+" "+list.size());
		Iterator itr=list.listIterator();
		while(itr.hasNext()){
		Object obj =itr.next();	
		if(obj instanceof Integer)
			System.out.println(obj);
		}
		
	}

}
