package com.techcanvass.sel;

import java.io.File;

public class file_handling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			File f=new File("E:\\test\\abc1.txt");
			boolean b=f.createNewFile();
			if(b)
			{
				System.out.println("file is crated");
			}
			else
			{
				System.out.println("not created");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
