package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_HardAssert3_assertTrue 
{
	//3. assertTrue
		@Test
		public void TC1()
		{	
			boolean actResult= false;
			
			Assert.assertTrue(actResult,"act result is false: ");		
		}		
}
