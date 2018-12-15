package com.techcanvass.sel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class collection_Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list is orderd and allow duplicate value
		//set dont allow duplicagte
		List<String>  name=new ArrayList<String>();
		name.add("Vicky");
		name.add("ram");
		name.add("shyam");
		name.add("kumar");
		name.add("kumar");
		name.add("kumar");
		//print object
		System.out.println(name);
		System.out.println("Before deletion element Size of Arraylist:"+name.size());
		name.remove(2);
		System.out.println("After Deletion of element size is:"+name.size());
		
		//getting one element from array list
		
		System.out.println("first element is:"+name.get(0));

		//print element one by one
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String myname = (String) iterator.next();
			System.out.println(myname);
			
		}
		
	}

}

