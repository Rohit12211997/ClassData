package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Sample2_Xpathby_attribute 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		//ENTER USERNAME
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohit.kadam.9567");
		
		
		//ENTER PASSWORD
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		
		//CLICK THE LOGIN BUTTON
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}

