package com.techcanvass.sel;

import java.util.HashMap;
import java.util.Map;

public class collection_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mymap=new HashMap<Integer,String>();
		
		mymap.put(1,"shyam");
		mymap.put(3, "ram");
		mymap.put(5, "kumar");
		mymap.put(6, "Radha");
		mymap.put(8, "Abc");
		
		System.out.println(mymap);
		System.out.println(mymap.get(5));
		mymap.remove(3);
		System.out.println(mymap);
		
	}

}
