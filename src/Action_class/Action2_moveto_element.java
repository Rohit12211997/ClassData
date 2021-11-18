package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2_moveto_element 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(3000);
	
	//step 1
	
	WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	

	//step2:
	Actions act=new Actions(driver);
	
	//step3:
	act.moveToElement(login).perform();
	
	Thread.sleep(3000);
	
	//click on orders option
	driver.findElement(By.xpath("//div[text()='Orders']")).click();

}
}
