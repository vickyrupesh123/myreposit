package com.radio_check_drop_table.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multile_checkbix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		List<WebElement> l=d.findElements(By.name("tool"));
		for(int i=0;i<l.size();i++)
		{
			l.get(i).click();
		}
					
	}

}
