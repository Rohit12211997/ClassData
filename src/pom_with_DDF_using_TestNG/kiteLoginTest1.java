package pom_with_DDF_using_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kiteLoginTest1 
{
	  KiteLogin1Page login1;
	  KiteLogin2Page login2;
	  KiteHomePage home;
	  org.apache.poi.ss.usermodel. Sheet sh;
	  WebDriver driver;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		Reporter.log("open Browser",true);
		FileInputStream file=new FileInputStream("C:\\Users\\shiv\\Desktop\\selenium software\\framework.xlsx");
	      sh = WorkbookFactory.create(file).getSheet("DDF");
		
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
			 driver = new ChromeDriver();
		     driver.get("https://kite.zerodha.com/");
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.manage().window().maximize();
		     
		      login1 = new KiteLogin1Page(driver);
		      login2= new KiteLogin2Page(driver);
		      home=new KiteHomePage(driver);      
	  
	}
	
	@BeforeMethod
	public void loginToApplication() 
{
	
	   Reporter.log("login to application",true);
	   login1.inpKiteLogin1Pageusername(sh.getRow(0).getCell(0).getStringCellValue());
	   login1.inpKiteLogin1PagePassward(sh.getRow(0).getCell(1).getStringCellValue());
	   login1.clickKiteLogin1PageLoginBtn();
	   login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
	   login2.clickKiteLogin2PageContinueBtn();
}
	
	
	@Test
	public void verifyUserID() 
	{
		Reporter.log("verify User ID",true);
		//home.verifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		String actuserID=home.getKiteHomePageActuserID();
		String expuserID=sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actuserID, expuserID,"act& exp userID are diffrent");
	}
	@AfterMethod
	public void logoutfromApplication() 
	{
		Reporter.log("logout from application",true);
	}

	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("close Browser",true);
		
		login1=null;
		login2=null;
		home=null;
		driver.close();
	}
	
		
	
	
}
