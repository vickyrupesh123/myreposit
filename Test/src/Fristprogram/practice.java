package Fristprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		
		d.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("ram");
		d.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
		
					
		List<WebElement> l=d.findElements(By.name("tool"));
		for (int i = 0; i < l.size(); i++) {
			l.get(i).click();
		}
		
		
		
		WebElement w=d.findElement(By.id("continents"));
		Select sl=new Select(w)	;
		
		List< WebElement> dd=sl.getOptions();
		for (int i = 0; i < dd.size(); i++) {
			System.out.println(dd.get(i).getText());
						
		}
	}

}
