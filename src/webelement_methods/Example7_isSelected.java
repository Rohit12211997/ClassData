package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_isSelected
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe\\");
	
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://en-gb.facebook.com/");
	  
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  
	  Thread.sleep(2000);
	  
	   WebElement femaleradiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	  
	  boolean result=femaleradiobutton.isSelected();
}
}