package com.techcanvass.sel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class collection_map_treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Map<Integer,String> mymap=new TreeMap<Integer,String>();
		
		mymap.put(1,"shyam");
		mymap.put(8, "Abc");
		mymap.put(3, "aaram");
		mymap.put(6, "Radha");
		mymap.put(5, "kumar");
		mymap.put(4, "aaram");
		
		System.out.println(mymap);
		System.out.println(mymap.get(5));
		mymap.remove(3);
		System.out.println(mymap);
		
		Set<Integer> k=mymap.keySet();
		
		for (Iterator iterator = k.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println(mymap.get(key));
			
		}
		
	}

}
