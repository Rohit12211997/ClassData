package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4printalloptionslistbox_months 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe\\");

	WebDriver driver = new ChromeDriver();

	driver.get("https://en-gb.facebook.com/");

	// click on Create New Account btn
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	
	
	//step1: 
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
	
	List<WebElement> AllElements = s.getOptions();
	
	for( WebElement SingleElement: AllElements) 
	{
		String text = SingleElement.getText();
		System.out.println(text);
	}
}
}
