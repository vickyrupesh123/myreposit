package com.dbconnection.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mysql_connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.manage().window().maximize();
		
		
		//database connection code
		String s="jdbc:mysql://localhost:3306/Selenium";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(s,"root","");
		System.out.println("Database connection is created");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		
		while(rs.next())
		{
			String username=rs.getString(1);
			String pass=rs.getString("pass");
			
			//fetched data from the mysql databse pass to web element
			d.findElement(By.xpath("//*[@id='txtLoginid']")).sendKeys(username);
			d.findElement(By.xpath("//input[contains(@id,'txtpassword')]")).sendKeys(pass);
			d.findElement(By.xpath("//input[@id='btnLogin']")).click();
			d.switchTo().alert().accept();
			Thread.sleep(4000);
			
			System.out.print(username);
			System.out.print(" "+pass);
			System.out.println();
			
		}
		
		
		
	}

}
