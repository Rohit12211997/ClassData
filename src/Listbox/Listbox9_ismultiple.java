package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox9_ismultiple 
{

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe\\\\");

			WebDriver driver = new ChromeDriver();

			driver.get("file:///C:/Users/shiv/Desktop/selenium%20software/sample4.html");


			WebElement ele = driver.findElement(By.xpath("//select[@multiple='true']"));
			
			Select s=new Select(ele);
			
			boolean result = s.isMultiple();
			System.out.println(result);
			
			if(result)
			{
				System.out.println("Listbox is of multi-selectable");
			}
			else {
				System.out.println("Listbox is of single-selectable");
			}
			
		}
		
}

