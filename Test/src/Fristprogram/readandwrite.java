package Fristprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class readandwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method st
		
		//writing data into file
		FileOutputStream w=new FileOutputStream("E:\\test\\file1.doc");
		String s="this is exaple of write data into file";
		byte[] b=s.getBytes();
		w.write(b);
		
		//reading data from file
		FileInputStream r=new FileInputStream("E:\\test\\file1.doc");
		int i=0;
		while((i=r.read())!=-1)
		{
			System.out.print((char)i);
			
		}

	}

}
