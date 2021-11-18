package Action_class;

import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action5_Doubleclick 
{
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
	Actions act=new Actions(driver);
	
    act.doubleClick(ele).perform();
	
//	act.moveToElement(ele).doubleClick().build().perform();
	
//	act.moveToElement(ele).perform();
//	act.doubleClick().perform();
	
	
}
}
