package Fristprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Connection;

public class p2 {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.manage().window().maximize();
				
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
				d.findElement(By.id("txtLoginid")).sendKeys(id.toString());
				d.findElement(By.id("txtpassword")).sendKeys(pass.toString());
				d.findElement(By.id("btnLogin")).click();
				d.switchTo().alert().accept();
				Thread.sleep(3000);
			
				System.out.print(id);
				System.out.print(" "+pass);
				System.out.println();
				
			}
			
		} 
		
		
		
		
		
		
	}

}

