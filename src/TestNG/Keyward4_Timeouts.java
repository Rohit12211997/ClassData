package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyward4_Timeouts 
{

	@Test(timeOut=5000)            
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(4000);
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("running TC2",true);
	}
	
}
