package Fristprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		System.out.println("Before");
		d.findElement(By.xpath(".//*[@class='a-image-container a-dynamic-image-container']")).click();
		//System.out.println("After"+we);
		 
		
	}

}
