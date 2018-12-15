package Fristprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class auto {

	public static void main(String[] args) {
		// TODO Auto-generated method 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	
	driver.findElement(By.id("txtName")).sendKeys("Vicky");
	driver.findElement(By.name("txtEmail")).sendKeys("vicky@gmail.com");
	driver.findElement(By.id("txtContact")).sendKeys("09876554321");
	driver.findElement(By.tagName("textarea")).sendKeys("This is the demo example of aumation testing");
	String s= driver.getTitle();
	//System.out.println("this is the name of the title"+s);
	
	
	driver.findElement(By.name("btnSubmit")).click();
	
	
	}

}
