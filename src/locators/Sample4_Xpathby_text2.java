package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4_Xpathby_text2 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	
	//click on login button --> using xpath by text
	
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
}
}
