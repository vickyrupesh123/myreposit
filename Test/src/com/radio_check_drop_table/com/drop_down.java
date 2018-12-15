package com.radio_check_drop_table.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		WebElement we=d.findElement(By.name("continents"));
		Select sl=new Select(we);
		List<WebElement> l=sl.getOptions();
		for(int i=0;i<l.size();i++)
		{
			//System.out.println(l.get(i).getText());
				//OR
			l.get(i).click();
			Thread.sleep(2000);
			
		}

	}

}
