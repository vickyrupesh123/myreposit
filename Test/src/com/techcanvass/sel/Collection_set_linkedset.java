package com.techcanvass.sel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_set_linkedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get method not support
HashSet<String> name=new LinkedHashSet<String>();

name.add("Vicky");
name.add("ram");
name.add("shyam");
name.add("kumar");
name.add("kumar");
name.add("kumar");
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
