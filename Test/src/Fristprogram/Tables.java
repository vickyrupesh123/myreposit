package Fristprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tables {
	

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://toolsqa.com/automation-practice-table/");
	String s=d.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[1]")).getText();
	System.out.println("Name of the city is:"+s); 
	
	////*[@id="content"]/table/tbody/tr[1]/td[1]
	////*[@id="content"]/table/tbody/tr[2]/td[1]
	////*[@id="content"]/table/tbody/tr[3]/td[1]
	////*[@id="content"]/table/tbody/tr[4]/td[1]
	
	String before_xpath="//*[@id=\"content\"]/table/tbody/tr[";
	
	String after_xpath="]/td[1]";
	
	for(int i=1;i<=4;i++)
	{
		String name=d.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
		System.out.println("City name is"+name);
	}

	
	}
 
}

