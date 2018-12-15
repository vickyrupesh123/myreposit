package Fristprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class radio_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\Desktop\\Rupesh\\ChromeDriver.exe");
WebDriver d=new ChromeDriver();
d.get("http://toolsqa.com/automation-practice-form/");
//radio button
d.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
//radio button with multiple value
List<WebElement> rb=d.findElements(By.name("exp"));
rb.get(2).click();
boolean b=rb.get(2).isSelected();
if(b==true)
	System.out.println("check box is selected:"+b);

//check check boxes one by one 
 List<WebElement> ck=d.findElements(By.name("profession"));
 ck.get(1).click();
 ck.get(0).click();
 
 //select multiple check boxes at a time
 List<WebElement> we2=d.findElements(By.name("tool"));
 String s;
  for (int i=0;i<we2.size();i++)
 	{
	 	we2.get(i).click();
	    //s=we2.get(i).getAttribute("value");
	 	
	 }
  
}

}
