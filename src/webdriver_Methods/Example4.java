package webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4
{
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	}
}
