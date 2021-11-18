package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Exetion3 
{

	@Test
	public void openApplication3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\shiv\\\\\\\\Desktop\\\\\\\\selenium software\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		Thread.sleep(5000);
		
		driver.close();
	}
}
