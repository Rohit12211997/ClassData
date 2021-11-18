package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_HardAssert6_assertNotNull 
{
	//5. assertNull
		@Test
		public void TC1()
		{	
			String result = null;
			
			Assert.assertNotNull(result, "act result is null: ");	
		}		
}
