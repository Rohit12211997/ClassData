package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action6_DropandDrag 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
    Thread.sleep(2000);
	
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

	Actions act=new Actions(driver);

	//act.dragAndDrop(source, dest).perform();
		
	act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
	
}
}
