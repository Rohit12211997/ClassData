package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyward5_dependOnmethod2 
{
	@Test           
	public void login1() 
	{
		Reporter.log("running login1",true);
	}
	
	@Test           
	public void login2() 
	{
		Reporter.log("running login2",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"login1","login2"})
	public void logout() 
	{
		Reporter.log("running logout",true);
	}		
}
