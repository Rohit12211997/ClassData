package POM_With_Pagefactory_Using_DDF;

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
					System.out.println("Fail");
				}
			}


			public String getKiteHomePageActUserID() {
				// TODO Auto-generated method stub
				return null;
			}
			
}
