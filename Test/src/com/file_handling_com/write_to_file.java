package com.file_handling_com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class write_to_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writing data into doc file
		
		FileOutputStream w=new FileOutputStream("E:\\test\\test.doc");
		String s="This is the example of writing data into file";
		byte[] b=s.getBytes();
		//System.out.println("data to be write into files");
		w.write(b);
		
		//reading data from doc file
		
		FileInputStream r=new FileInputStream("E:\\test\\test.doc");
		int i;
		while((i=r.read())!=-1)
		{
			char data=(char)i;
			System.out.print(data);
			
		}
			
		
	}

}
