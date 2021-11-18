package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable3_getdatafromparticularIndex
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("file:///C://Users//shiv//Desktop//selenium%20software//table.html");
	
	String text = driver.findElement(By.xpath("//table[@border='2']/tbody/tr[2]/td[2]")).getText();
	
	System.out.println(text);
	
}
}
