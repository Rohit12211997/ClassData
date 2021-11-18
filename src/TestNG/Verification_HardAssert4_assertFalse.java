package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_HardAssert4_assertFalse
{
	//4. assertFalse
		@Test
		public void TC1()
		{	
			boolean actResult= true;
			
			Assert.assertFalse(actResult, "act result is true: ");	
		}		
}
