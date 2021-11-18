package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_isEnabled 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe\\");
	
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://en-gb.facebook.com/");
	  
	  boolean result = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).isEnabled();
	  System.out.println(result);
	  
	  // with using loop u can check
	  
	  if(result)
	  {
		  System.out.println("element is enabled");
	  }
	  else
	  {
		  System.out.println("element is disabled");
	  }
}
}
