package com.javacollection.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class set_linkedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new LinkedHashSet<String>();
		s.add("bca");
		s.add("abc");
		s.add("pqr");
		s.add("pqr");
		s.add("mno");
		s.add("str");
		System.out.println(s);
		System.out.println("before deletion size"+s.size());
		s.remove(1);
		System.out.println("after deletion size:"+s.size());
		System.out.println(s);
		for(Iterator< String> myi=s.iterator();myi.hasNext();)
		{
			String st=myi.next();
			System.out.print(" "+st);
			
		}

	}

}
