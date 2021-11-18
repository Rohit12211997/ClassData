package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_Clear
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe\\");
	
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
	  un.sendKeys("Rohit");
	  Thread.sleep(3000);
	  un.clear();
}
}
