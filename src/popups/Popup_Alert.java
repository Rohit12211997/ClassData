package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Alert 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

	//click on click me btn
	driver.findElement(By.xpath("//button[text()='Click me!']")).click();
	
	Thread.sleep(2000);
	
	//switch to alert
	Alert alt = driver.switchTo().alert();
	
	//alt.dismiss();  //use click on cancel btn
	
	String text = alt.getText();
	System.out.println(text);
	
	alt.accept();
	
	
	
	
	
//	String text = driver.switchTo().alert().getText();
//	System.out.println(text);
//	
//	driver.switchTo().alert().accept();
}
}
