package POM_with_DDF_using_TestNG_Baseclass_utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	// @author name: Rohit
	// this method used to nget test data from excel sheet
	// need to pass to parameters ie. rowindex , colindex
public static String getTestData(int rowIndex,int colindex) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\shiv\\Desktop\\selenium software\\framework.xlsx");
    Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
    String value = sh.getRow(rowIndex).getCell(colindex).getStringCellValue();
    return value;
}


public static void capturescreenshot(WebDriver driver,int TCID) throws IOException 
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\shiv\\eclipse-workspace\\Selenium\\Screenshots\\TastcaseID"+TCID+".jpg");
	FileHandler.copy( source, dest);
}
}
