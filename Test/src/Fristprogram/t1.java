package Fristprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	String url=d.getCurrentUrl();
	System.out.println("Url pf [age is"+url);
	String title= d.getTitle();
	System.out.println("Title of page is:"+title);
	WebElement we=d.findElement(By.name("ddlSubject"));
	Select sel=new Select(we);
	sel.selectByVisibleText("Webinar Enquiry");
	
	
	
	
	
	
	
	
	
	}

}
