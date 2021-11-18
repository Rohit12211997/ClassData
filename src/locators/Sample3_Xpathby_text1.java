package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3_Xpathby_text1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	//click on forgotten password link
	
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
}
}
