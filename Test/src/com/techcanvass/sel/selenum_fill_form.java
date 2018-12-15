package com.techcanvass.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class selenum_fill_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
driver.manage().window().maximize();
driver.findElement(By.id("txtName")).sendKeys("Rupesh");
driver.findElement(By.name("btnSubmit")).click();


WebElement we=  driver.findElement(By.id("ddlSubject"));
Select sel=new Select(we);
sel.selectByIndex(1);
sel.selectByValue("Webinar Enquiry");
sel.selectByVisibleText("Feedback");

//driver.close();
	}

}
