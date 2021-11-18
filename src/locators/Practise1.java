package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://accounts.google.com/");
	
	driver.findElement(By.xpath("//input[@spellcheck='false']")).sendKeys("rohitkadam301@gmail.com");
	
	
}
}
