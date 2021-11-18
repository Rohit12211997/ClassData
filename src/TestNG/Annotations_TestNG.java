package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_TestNG 
{
	@BeforeClass
	public void openBrowser() 
	{
		Reporter.log("----open browser---",true);
	}	
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("----login To App---",true);
	}
	
	@Test
	public void verifyUserID1()
	{
		Reporter.log("running verifyUserID1 Test script ",true);
	}
	
	@Test
	public void verifyUserID2()
	{
		Reporter.log("running verifyUserID2 Test script ",true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("----logout from App---",true);
	}
		
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("----close browser---",true);
	}	
}
