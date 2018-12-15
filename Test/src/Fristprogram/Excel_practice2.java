package Fristprogram;

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



public class Excel_practice2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		
		FileInputStream r=new FileInputStream("C:\\Users\\Vicky\\Desktop\\Rupesh\\user_logindata.xls");
		
		HSSFWorkbook work=new HSSFWorkbook(r);
		HSSFSheet sh=work.getSheetAt(0);
		HSSFCell id,pass;
		
		for(int i=1;i<sh.getLastRowNum();i++)
		{
			int j=1;	
			id=sh.getRow(i).getCell(j);
			pass=sh.getRow(i).getCell(j+1);
			
			d.findElement(By.xpath("//*[@id=\"txtLoginid\"]")).sendKeys(id.toString());
			d.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys(pass.toString());
			d.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(4000);
			Alert al=d.switchTo().alert();
			al.accept();
			
			Thread.sleep(4000);
			d.findElement(By.xpath("//*[@id=\"txtLoginid\"]")).clear();
			d.findElement(By.xpath("//*[@id=\"txtpassword\"]")).clear();
			
			
			System.out.print(id);
			System.out.print(" "+pass);
			System.out.println();
			
			
		}
		
		
		
	}

}
