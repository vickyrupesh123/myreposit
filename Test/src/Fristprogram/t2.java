package Fristprogram;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
WebDriver d=new ChromeDriver();
//String strurl="http://demoqa.com/";
String url="https://techcanvass.com/";
d.get(url);

//d.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
//d.findElement(By.xpath("/html/body")).click();

//go to menu and its sub menu
//d.findElement(By.xpath("//*[@id=\"post-1\"]/header/h2/a")).click();

//calling to the main menu
d.findElement(By.xpath("//*[@id=\"manu\"]/li[7]/a")).click();
d.findElement(By.xpath("//*[@id=\"manu\"]/li[7]/ul/li[2]/a")).click();


//d.findElement(By.tagName("<a href=\"Contact-Techcanvass.aspx\">Contact us</a>")).click();

//go back to home page
d.navigate().back();

//go back to sub menu
d.navigate().forward();


	}

}
