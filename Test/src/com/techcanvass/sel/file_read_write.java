package com.techcanvass.sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_read_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//for writing data into file  use FileOutputStream and fileWrite 
		
		FileOutputStream myfile=new FileOutputStream("E:\\test\\abc1.txt");
		String s="wel come to testing";
		byte[] b= s.getBytes();
		myfile.write(b);
		
		//Read 
		
		FileInputStream r=new FileInputStream("E:\\test\\abc1.txt");
		int i=0;
		while((i=r.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		
		r.close();
	}

}
