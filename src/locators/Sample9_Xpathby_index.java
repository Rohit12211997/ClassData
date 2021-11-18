package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9_Xpathby_index
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/shiv/Desktop/selenium%20software/Xpathbyindex.html");
	
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Rohit");
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kadam");
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("7721814183");
}
}

