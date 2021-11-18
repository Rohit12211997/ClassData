package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1_hiddendivision
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	//click on close button
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(2000);
	
	//click on login button
	
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	Thread.sleep(2000);
	//enter UN
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
	
}
}
