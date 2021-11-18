package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8_Xpathbycontains_usingattribute2 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	// click on the login button--->using Xpath by contains using attriute
	
	driver.findElement(By.xpath("//button[contains(@class,'_51sy')]")).click();
}
}
