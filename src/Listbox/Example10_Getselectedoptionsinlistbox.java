package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example10_Getselectedoptionsinlistbox
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe\\");
	
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://en-gb.facebook.com/");
	  
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  
	  Thread.sleep(3000);
	  
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  
	  Select s=new Select(month);
	  
	WebElement alloption = s.getFirstSelectedOption();
	String text = alloption.getText();
	System.out.println(text);
	 
}
}
