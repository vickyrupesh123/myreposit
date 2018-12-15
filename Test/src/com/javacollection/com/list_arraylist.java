package com.javacollection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(50);
		li.add(40);
		li.add(30);
		System.out.println(li);
		System.out.println("Size of array:"+li.size());
		li.remove(3);
		System.out.println("Size of array:"+li.size());
		//get specific element
		System.out.println("Element at first location:"+li.get(0));	
		for (Iterator myi = li.iterator(); myi.hasNext();) {
			Integer i = (Integer) myi.next();
			System.out.print(" "+i);
			
		}
		
		
		
	}

}
