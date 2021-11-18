package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_HardAssert1_assertEquals 
{
	//1. assertEquals
		@Test
		public void TC1()
		{	
			String actResult ="Hi";
			String expResult ="Hellow";
			
			Assert.assertEquals(actResult, expResult,"both results are diffrent: ");	
		}
}
