package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  RunningOnlyFailTestcase_sample2
{
	@Test
	public void TC4() 
	{
		Reporter.log("running TC4",true);
	}
	
	@Test
	public void TC5() 
	{
		Reporter.log("running TC5",true);
	}
	
	@Test
	public void TC6() 
	{
		//Assert.fail();
		Reporter.log("running TC6",true);
	}
}
