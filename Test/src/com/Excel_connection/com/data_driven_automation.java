package com.Excel_connection.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class data_driven_automation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//to connect to excel download apache POI and library file of PO
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.manage().window().maximize();
		
		//getting started with the excel data
		//fetch user name and password from excel
		FileInputStream in=new FileInputStream("C:\\Users\\Vicky\\Desktop\\Rupesh\\user_logindata.xls");
		
		HSSFWorkbook work=new HSSFWorkbook(in);
		HSSFSheet sheet=work.getSheetAt(0);
		HSSFCell id,pass;
		int col=1;
		for(int i=1;i<sheet.getLastRowNum();i++)
		{
			id=sheet.getRow(i).getCell(col);
			for(int j=2;j<sheet.getRow(i).getLastCellNum();j++)
			{
				pass=sheet.getRow(i).getCell(j);
				
				d.findElement(By.xpath(".//*[@id='txtLoginid']")).sendKeys(id.toString());
				d.findElement(By.xpath(".//*[contains(@id,'txtpassword')]")).sendKeys(pass.toString());
				
				d.findElement(By.id("btnLogin")).click();
				Alert alert=d.switchTo().alert();
				Thread.sleep(3000);
				alert.accept();
				
				d.findElement(By.xpath(".//*[@id='txtLoginid']")).clear();
				d.findElement(By.xpath(".//*[contains(@id,'txtpassword')]")).clear();
				Thread.sleep(3000);
				
				
				System.out.print(id);;
				System.out.print(" "+pass);
			}
			System.out.println();
		}
		
	}

}
