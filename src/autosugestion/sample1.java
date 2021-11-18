package autosugestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
	
	Thread.sleep(2000);
	
	String expectedText = "redmi note 9";
	
	 List<WebElement> Allelement = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	 
	
	System.out.println(Allelement.size());
	
for (WebElement element : Allelement) 
{
	String actText = element.getText();
	System.out.println(actText);
	if (actText.equals(expectedText))
	{
		element.click();
		break;
	}
}
	
}
}
