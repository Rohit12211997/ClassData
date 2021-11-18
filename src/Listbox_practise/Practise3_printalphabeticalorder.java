package Listbox_practise;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise3_printalphabeticalorder 
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
	WebElement month = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select s=new Select(month);
	
	List<WebElement> alloption = s.getOptions();
	
	TreeSet<String> tr=new TreeSet<String>();
	
	for(WebElement option:alloption)
	{
		String text = option.getText();
		tr.add(text);	
	}
	for(String text:tr)
	{
		System.out.println(text);
	}
	}
	
}

