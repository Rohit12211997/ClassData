package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_getRowsize 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("file:///C://Users//shiv//Desktop//selenium%20software//table.html");
	
	List<WebElement> Allrows = driver.findElements(By.xpath("//table[@border='2']/tbody/tr"));
	System.out.println(Allrows.size());
	
	
}
}
