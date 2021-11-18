package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe\\");
	
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://en-gb.facebook.com/");
	  
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  
	  Thread.sleep(3000);
	  
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  
		//step2:
				Select s=new Select(month);
				
		//step3:
				//s.selectByValue("12");      //String value
				
				s.selectByVisibleText("Nov");  //String text
				//s.selectByIndex(1);          // int index
	  
}
}
