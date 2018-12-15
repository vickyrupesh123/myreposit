package com.techcanvass.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://lms.techcanvass.co.in/");
		d.findElement(By.id("txtLoginid")).sendKeys("root");
		d.findElement(By.id("txtpassword")).sendKeys("root123");
		Thread.sleep(5000);
		d.findElement(By.id("btnLogin")).click();
		//hanlde alert
		d.switchTo().alert().accept();
		Thread.sleep(5000);
		d.findElement(By.id("txtLoginid")).clear();;
		d.findElement(By.id("txtpassword")).clear();

	}

}
