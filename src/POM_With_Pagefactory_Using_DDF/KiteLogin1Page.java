package POM_With_Pagefactory_Using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{

	//step1: declaration--> global
			@FindBy(xpath="//input[@id='userid']") private WebElement UN;   //private WebElement UN=driver.findElement(By.xpath("xpath expression"));
			@FindBy(xpath="//input[@id='password']") private WebElement PWD;   //private WebElement PWD=driver.findElement(By.xpath("xpath expression"));
			@FindBy(xpath="//button[text()='Login ']") private WebElement login;  //private WebElement login=driver.findElement(By.xpath("xpath expression"));
			@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']") private WebElement errorMsg;


			//step2: initialization
	public KiteLogin1Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
			}


	//step3: usage
	public void inpKiteLogin1Pageusername(String username)
	{

		UN.sendKeys(username);
	}

	public void  inpKiteLogin1PagePassward(String Passward)
	{
		PWD.sendKeys(Passward);
	}

	public void clickKiteLogin1PageLoginBtn()
	{
		login.click();
	}


	public void verifyKiteLogin1PageErrorMsg(String expErrorMSg)
	{
		String ActErrorMSG = errorMsg.getText();
		
		if(ActErrorMSG.equals(expErrorMSg)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
			
	}
}
