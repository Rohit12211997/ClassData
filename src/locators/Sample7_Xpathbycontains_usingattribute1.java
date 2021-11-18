package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7_Xpathbycontains_usingattribute1
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	// Enter username by using--->Xpath by contains using attribute
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'Email ')]")).sendKeys("rohit.kadam.9567");
	
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext ')])[2]")).sendKeys("12345");
}
}
