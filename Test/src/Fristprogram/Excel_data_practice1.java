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

import com.google.common.collect.Table.Cell;

public class Excel_data_practice1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.manage().window().maximize();
		
		//OR
		//d.switchTo().alert().accept();
		
		
		FileInputStream r=new FileInputStream("C:\\Users\\Vicky\\Desktop\\Rupesh\\user_logindata.xls");
		HSSFWorkbook work=new HSSFWorkbook(r);
		HSSFSheet sheet=work.getSheetAt(0);
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			int j=1;
			HSSFCell id,pass;
			id=sheet.getRow(i).getCell(j);
			pass=sheet.getRow(i).getCell(j+1);
			
			d.findElement(By.xpath("//input[@id='txtLoginid']")).sendKeys(id.toString());
			d.findElement(By.xpath("//*[@id='txtpassword']")).sendKeys(pass.toString());
			Thread.sleep(4000);
			//d.findElement(By.xpath("//*[contains(text(),' click here')]")).click();
			d.findElement(By.id("btnLogin")).click();
			Thread.sleep(4000);
			Alert al=d.switchTo().alert();
			al.accept();
			
					
			System.out.print(id);
			System.out.print(" "+pass);
			System.out.println();
				
			
		}
		

	}

}
