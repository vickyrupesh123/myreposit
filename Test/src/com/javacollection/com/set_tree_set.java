package com.javacollection.com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tree set
		Set<String> s=new TreeSet<String>();
		s.add("bca");
		s.add("abc");
		s.add("pqr");
		s.add("pqr");
		s.add("mno");
		s.add("str");
		System.out.println(s);
		System.out.println("before deletion size"+s.size());
		//s.remove(1);//Deletion operation is not allowed
		
		
		System.out.println(s);
		for(Iterator< String> myi=s.iterator();myi.hasNext();)
		{
			String st=myi.next();
			System.out.print(" "+st);
			
		}
	}

}
