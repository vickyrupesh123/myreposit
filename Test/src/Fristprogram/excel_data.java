package Fristprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class excel_data {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://lms.techcanvass.co.in/");
		
		//d.findElement(By.id("txtLoginid")).sendKeys("abc");
		//d.findElement(By.id("txtpassword")).sendKeys("abc");
		//d.findElement(By.id("btnLogin")).click();
		//Thread.sleep(3000);
		//d.switchTo().alert().accept();		
		
		//d.findElement(By.id("txtLoginid")).clear();
		//d.findElement(By.id("txtpassword")).clear();

		FileInputStream r=new FileInputStream("C:\\Users\\Vicky\\Desktop\\Rupesh\\user_logindata.xls");
		HSSFWorkbook work=new HSSFWorkbook(r);
		HSSFSheet sheet=work.getSheetAt(0);
		HSSFCell user,pass;
		
		//simple way to get data 
	/*	for(int i=1;i<sheet.getLastRowNum();i++)
		{		
			int j=1;
			user=sheet.getRow(i).getCell(j);
			pass=sheet.getRow(i).getCell(j+1);
			
			System.out.print(user.toString());
			System.out.print(" "+pass.toString());
			System.out.println();
		}
	*/	
		//get row and colomn using the 2 dimention array
		
		for(int i=1;i<sheet.getLastRowNum();i++)
		{
			int col=1;
			user=sheet.getRow(i).getCell(col);
			for(int j=2;j<sheet.getRow(i).getLastCellNum();j++)
			{
				
				pass=sheet.getRow(i).getCell(j);
				d.findElement(By.id("txtLoginid")).sendKeys(user.toString());
				d.findElement(By.id("txtpassword")).sendKeys(pass.toString());
				d.findElement(By.id("btnLogin")).click();
				Thread.sleep(3000);
				d.switchTo().alert().accept();		
				d.findElement(By.id("txtLoginid")).clear();
				d.findElement(By.id("txtpassword")).clear();
				Thread.sleep(3000);
				
				
				
				System.out.print(user.toString());
				System.out.print(" "+pass.toString());
				System.out.println();
				
			}
			
		}
			
			
			
		
		
	}

}
