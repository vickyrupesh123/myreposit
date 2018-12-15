package Fristprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_command {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.manage().window().maximize();
		Thread.sleep(6000);
		d.findElement(By.name("proceed")).click();
		Alert alert= d.switchTo().alert();
		String s= alert.getText();
		System.out.println(s);
		Thread.sleep(9000);
		alert.accept(); //click on OK Button
		//alert.dismiss(); //Click on CANCEL Button
		
		
		 
	}

}
