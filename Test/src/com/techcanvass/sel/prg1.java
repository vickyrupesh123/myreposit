package com.techcanvass.sel;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5;
		int n2=7;
		int mul,sub,div;
		//add=n1+n2;
		mul=n1*n2;
		sub=n2-n1;
		div=n2/n1;
		//System.out.println("result is:"+add);
		//System.out.println("multipliucation is:"+mul);
		System.out.println("Subtraction is:"+sub);
		System.out.println("Div is:"+div);
		
		
		addtion a=new addtion();
		int res=a.add(n1,n2);
		System.out.println("addition is:"+res);
		
		addtion m=new addtion();
		int res1=m.mul(n1,n2);
		System.out.println("multiplication  is:"+res1);
		
		//System.out.println("add result="+add(n1,n2));
		//System.out.println("mul result="+mul(n1,n2));
		
	}


}
