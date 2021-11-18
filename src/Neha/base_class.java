package Neha;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM_with_DDF_using_TestNG_Baseclass_utilityclass.Utility;

public class base_class 
{
WebDriver driver;
	

	public void initializeBrowser(String browserName) throws IOException
	{	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\eclipse-workspace\\Selenium\\Browsers\\chromedriver.exe");
			
		driver=new ChromeDriver(options);
		
		driver.get(Utility.getPropertyFileData("URL"));
		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage
}
