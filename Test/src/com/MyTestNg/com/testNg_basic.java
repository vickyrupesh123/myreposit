package com.MyTestNg.com;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Excel_connection.com.data_driven_automation;

public class testNg_basic {
	WebDriver d;
	

	@BeforeMethod
	public void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		d=new ChromeDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void GoogletitleTest()
	{
		String title= d.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void GooglelogoTest()
	{
		boolean b=d.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	
	@Test
	public void GooglelinkTest()
	{
		boolean b=d.findElement(By.linkText("mail")).isDisplayed();		
	}
	
	@AfterMethod
	public void Teardown()
	{
		d.quit();
	}
	
}
