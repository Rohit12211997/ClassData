package POM_with_DDF_using_TestNG_Baseclass_utilityclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	WebDriver driver;
  public void initlizeBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		 driver = new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize(); 
  }
}
