package com.techcanvass.sel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class collection_set_sorted_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//it print data in alphabetical order
		SortedSet<String> name=new TreeSet <String>(); 

		name.add("vicky");
		name.add("ram");
		name.add("shyam");
		name.add("kumar");
		name.add("kumar");
		name.add("kumar");
		name.add("asingh");
		//print object

		System.out.println("Before deletion element Size of Arraylist:"+name.size());

		//remove only string 
		name.remove("ram");
		System.out.println("After Deletion of element size is:"+name.size());

		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String myname = (String) iterator.next();
			System.out.println(myname);
		}

		
	}

}
