package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2 
{
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	
	driver.get("https://www.flipkart.com/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\shiv\\Desktop\\scrrenshots\\xyz.jpg");
	
	FileHandler.copy(src, dest);
	
	
	
	
}
}
