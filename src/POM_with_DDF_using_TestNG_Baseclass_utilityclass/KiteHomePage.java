package POM_with_DDF_using_TestNG_Baseclass_utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	// step1: declaration
			@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;

			//step2: initialization
			public KiteHomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			public String getKiteHomePageActuserID()
			{
				String actText = userID.getText();
				return actText;
			}
		//step3: 
		public void verifyKiteHomePageUserID(String expUserID)
		{
			String actUserID = userID.getText();
				
		if(actUserID.equals(expUserID))
				{
				System.out.println("Pass");
			}
		else
				{
				System.out.println("Fail");			}
	}


			public String getKiteHomePageActUserID() {
				// TODO Auto-generated method stub
				return null;
			}
}

