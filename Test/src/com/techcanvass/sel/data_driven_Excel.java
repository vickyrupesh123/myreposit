package com.techcanvass.sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_driven_Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://lms.techcanvass.co.in/");
		
		FileInputStream fs=new FileInputStream("C:\\Users\\Vicky\\Desktop\\Rupesh\\login.xls");
		HSSFWorkbook work=new HSSFWorkbook(fs);
		HSSFSheet sheet=work.getSheetAt(0);
		for(int i =1;i<sheet.getLastRowNum();i++)
		{
			int j=1;
			HSSFCell id,pass;
			id=sheet.getRow(i).getCell(j);
			pass=sheet.getRow(i).getCell(j+1);
			
			
			d.findElement(By.id("txtLoginid")).sendKeys(id.toString());
			d.findElement(By.id("txtpassword")).sendKeys(pass.toString());
			Thread.sleep(2000);
			d.findElement(By.id("btnLogin")).click();
			
			d.switchTo().alert().accept();
			Thread.sleep(2000);
			d.findElement(By.id("txtLoginid")).clear();;
			d.findElement(By.id("txtpassword")).clear();
			
			System.out.print(id.toString());
			System.out.print(" "+pass.toString());
			System.out.println();

			
			System.out.print(id.toString());
			System.out.print(" "+pass.toString());
			System.out.println();
		}
		
		//by using 2d array
		
	/*	for (int i=1;i<sheet.getLastRowNum();i++)
		{
			HSSFCell id,pass;
			int col=1;
			id=sheet.getRow(i).getCell(col);

			for( int j=2;j<sheet.getRow(i).getLastCellNum();j++)
			{
				pass=sheet.getRow(i).getCell(j);
				
				
				d.findElement(By.id("txtLoginid")).sendKeys(id.toString());
				d.findElement(By.id("txtpassword")).sendKeys(pass.toString());
				Thread.sleep(5000);
				d.findElement(By.id("btnLogin")).click();
				
				d.switchTo().alert().accept();
				Thread.sleep(5000);
				d.findElement(By.id("txtLoginid")).clear();;
				d.findElement(By.id("txtpassword")).clear();

				Thread.sleep(5000);
				
				System.out.print(id.toString());
				System.out.print(" "+pass.toString());
				System.out.println();
			}
			
		}*/
		
		
	}
	

}
