package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup4_switchtomainpage_from_childwindow 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://skpatro.github.io/demo/links/");

	//click on new tab btn
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();

	Thread.sleep(2000);

	//get child window ID/address
	Set<String> AllIds = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(AllIds);
	
	String childWindowID = al.get(1);  // return address of child window
	
	//switch to child window
	driver.switchTo().window(childWindowID);         //string window id
	
	
	//click on Appium link
			driver.findElement(By.xpath("(//span[text()='Appium'])[1]")).click();

			Thread.sleep(3000);
			
			
			//switch to main page
			String mainPageID = al.get(0);
			driver.switchTo().window(mainPageID);
			
			Thread.sleep(3000);
			
			//click on new window btn from main
			driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
			
	
}
}
