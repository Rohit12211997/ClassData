package handlingof_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTotalNoOfLiksInGoogleWebpage
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
	System.out.println(Alllinks.size());
	
	for(WebElement link:Alllinks) {
		String text = link.getText();
		System.out.println(text);
	}
	
}
}
