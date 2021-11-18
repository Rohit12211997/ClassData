package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verificatation_softAssert1
{
	@Test
	public  void m1() {
		String actResult = "Hello";
		String ExpResult = "Hi";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actResult, ExpResult,"Verification 1 failed: both results are diffrent: ");
			
		String actResult1 = "abc";
		String ExpResult1 = "abc";
		soft.assertEquals(actResult1, ExpResult1,"Verification 2 failed: both results are diffrent: ");
				
		soft.assertAll();
	}
}
