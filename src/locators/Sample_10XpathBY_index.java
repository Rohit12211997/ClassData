package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_10XpathBY_index 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sanjay");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kadam");
	
	 
	
}
}
