package Fristprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exel_practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.findElement(By.xpath("//*[@id=\"txtLoginid\"]")).sendKeys("aBC");
		
		
		
	}

}
