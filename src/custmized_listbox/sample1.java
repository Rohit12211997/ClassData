package custmized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 
{
private static WebElement month;

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\selenium software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	Thread.sleep(3000);
	
	//step1
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//step2
	
	Actions act= new Actions(driver);
	
	//step3
	
	act.click(month).perform();
	
	//step4
	
Thread.sleep(2000);
	
	//step4: move to last option in a listbox
	for (int i = 1; i <=12; i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
	}
		
	for (int i = 1; i <=7; i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
	}
	
	act.sendKeys(Keys.ENTER).perform();
	
	
}
}
