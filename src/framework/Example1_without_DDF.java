package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_without_DDF 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// enter UN
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DV1510");
	
	// enter password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Year@123");
	
	//click login button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//enter PIN
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	
	//click continue button
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
    String actuserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
    String expUserID = "DV1510";
    

	if(actuserID.equals(expUserID))
	{
		System.out.println("Pass");
	}
	else 
	{
		System.out.println("Fail");
	}
	
	
	
}
}
