package com.dbconnection.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class db_conn_practice1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.manage().window().maximize();
		
		
		//
		Class.forName("com.mysql.jdbc.Driver");
		String path="jdbc:mysql://localhost:3306/Selenium";
		Connection con=DriverManager.getConnection(path,"root","");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from login");
		while(rs.next())
		{
			String user=rs.getString(1);
			String pass=rs.getString(2);
			
			d.findElement(By.id("txtLoginid")).sendKeys(user);
			d.findElement(By.id("txtpassword")).sendKeys(pass);
			d.findElement(By.id("btnLogin")).click();
			d.switchTo().alert().accept();
			Thread.sleep(4000);
			System.out.print(user);
			System.out.print(" "+pass);
			System.out.println();
		}
	}

}

