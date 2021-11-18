package POM_With_Pagefactory_Using_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
		FileInputStream file=new FileInputStream("C:\\Users\\shiv\\Desktop\\selenium software\\framework.xlsx");
	     org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
			WebDriver driver = new ChromeDriver();
		     driver.get("https://kite.zerodha.com/");
	     
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.manage().window().maximize();
	  
     KiteLogin1Page login1 = new KiteLogin1Page(driver);
		    
	     String UN = sh.getRow(0).getCell(0).getStringCellValue();
		     login1.inpKiteLogin1Pageusername(UN);
	     
	    String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	    login1.inpKiteLogin1PagePassward(PWD);
	    
		    login1.clickKiteLogin1PageLoginBtn();
		    
		    KiteLogin2Page login2= new KiteLogin2Page(driver);
		    
		    String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		    login2.inpKiteLogin2PagePin(PIN);
		    
		    login2.clickKiteLogin2PageContinueBtn();
		    
		    KiteHomePage home=new KiteHomePage(driver);
		    
	    String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
			home.verifyKiteHomePageUserID(expUserID);
			
			Thread.sleep(3000);
		
		   driver.close();
			
		    
	}
}

