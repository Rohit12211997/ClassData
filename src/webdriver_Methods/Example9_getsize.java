package webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_getsize 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		Dimension d1= driver.manage().window().getSize();
		System.out.println(d1);
		
	}  
}


  // Dimension d1 = driver.manage().window().getSize();
  // System.out.println(d1); 