package Fristprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.techcanvass.sel.selenum_fill_form;

public class drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement we=d.findElement(By.name("continents"));
		Select sel=new Select(we);
				
		List<WebElement> op=sel.getOptions();
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i).getText()); 	
		}
	
		//practice
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Desktop\\Rupesh\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		WebElement we=d.findElement(By.id("ddlSubject"));
		Select sl=new Select(we);
		//sl.selectByIndex(1);
		List<WebElement> l=sl.getOptions();
		System.out.println("Select Elemment is"+l.get(1).getText());
		*/
	}

}

