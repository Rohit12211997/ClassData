package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_with_DDF 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
{
	FileInputStream file=new FileInputStream("C:\\Users\\shiv\\Desktop\\selenium software\\framework.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//enter UN
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	
	// enter password
	  String password = sh.getRow(0).getCell(2).getStringCellValue(); 
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	
	//click login button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//enter PIN
	String pin = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	
	//click continue button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//get act user ID
	 String actuserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    String expUserID = sh.getRow(0).getCell(0).getStringCellValue();
	    

		if(actuserID.equals(expUserID))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
		Thread.sleep(2000);
		
		driver.close();
		
	
}
}
