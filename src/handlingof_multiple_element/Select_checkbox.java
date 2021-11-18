package handlingof_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Select_checkbox 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/shiv/Desktop/selenium%20software/checkbox.html");
	
	 List<WebElement> Allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 
	 for(WebElement checkbox:Allcheckboxes) {
		 checkbox.click();
		 Thread.sleep(1000);
	 }
	
	
	
}
}
