package com.javacollection.com;

import java.util.HashSet;
import java.util.Set;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class set_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
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
	}

}
