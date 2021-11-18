package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Exetion2
{
	@Test
	public void openApplication2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		Thread.sleep(5000);
		
		driver.close();
	}
}
