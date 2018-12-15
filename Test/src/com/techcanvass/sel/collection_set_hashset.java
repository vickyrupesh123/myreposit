package com.techcanvass.sel;

import java.util.HashSet;
import java.util.Iterator;

public class collection_set_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set in unoredred 
		//set dont allow duolicate
		//get method not support
HashSet<String> name=new HashSet<String>();

name.add("Vicky");
name.add("ram");
name.add("shyam");
name.add("kumar");
name.add("kumar");
name.add("kumar");
//print object

System.out.println("Before deletion element Size of Arraylist:"+name.size());
name.remove(2);
System.out.println("After Deletion of element size is:"+name.size());

//remove only string 
name.remove("ram");

for (Iterator iterator = name.iterator(); iterator.hasNext();) {
	String myname = (String) iterator.next();
	System.out.println(myname);
}

	}

}
