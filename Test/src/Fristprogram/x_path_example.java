package Fristprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		d.manage().window().maximize();
	
		d.findElement(By.xpath("//input[@id='txtName']")).sendKeys("vicky");
		d.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("vicky123@gmail.com");
		d.findElement(By.xpath("//input[starts-with(@id,'txtCon')]")).sendKeys("1234567890");
		
		//only for links
		d.findElement(By.xpath("//u[contains(text(),'info@techcanvass.com')]")).click();
										//OR
		//d.findElement(By.xpath("//*[text()='info@techcanvass.com']")).click();
			
		d.findElement(By.xpath("//input[contains(@name,'btnSubmit')]")).click();
		
		
	}

}
