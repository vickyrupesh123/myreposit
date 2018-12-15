package Fristprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class read_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream w=new FileOutputStream("E:\\test\\myfile.txt");
String s="data ot be write into file";
	byte[] b=s.getBytes();
	w.write(b);
	w.close();
	


	}

}
