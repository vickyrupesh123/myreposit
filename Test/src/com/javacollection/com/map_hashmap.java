package com.javacollection.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class map_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(1, "bca");
		m.put(3, "xyz");
		m.put(2, "abc");
		m.put(4, "pqr");
		m.put(6, "zyx");
		
		System.out.println(m);
		System.out.println("before deletion size:"+m.size());
		//s.remove(1);//Deletion operation is not allowed
		
		Set<Integer> key=m.keySet();
		
		System.out.println(m);
		for(Iterator< Integer> myi=key.iterator();myi.hasNext();)
		{
			Integer st=myi.next();
			System.out.print(" "+m.get(st));
			
		}
	}

}
