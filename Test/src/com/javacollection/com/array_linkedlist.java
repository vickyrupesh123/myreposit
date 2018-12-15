package com.javacollection.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class array_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List< String> l=new LinkedList<String>();	//int [] name=new int[4];
		l.add("abc");
		l.add("xtz");
		l.add("pqr");
		l.add("mno");
		//get element from specific location
		for(Iterator myi=l.iterator();myi.hasNext();)
		{
			String i= (String)myi.next();
			System.out.print(" "+i);
			
		}
		l.remove(3);
		System.out.println();
		for(Iterator<String> myi=l.iterator();myi.hasNext();)
		{			
			String s=myi.next();
			System.out.print(" "+s);
		}
		
	}

}
