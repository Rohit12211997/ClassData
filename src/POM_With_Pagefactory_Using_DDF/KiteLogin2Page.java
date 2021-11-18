package POM_With_Pagefactory_Using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{

	//step1: declaration
@FindBy(xpath="//input[@id='pin']")	private WebElement pin;
@FindBy(xpath="//button[text()='Continue ']")	private WebElement cntBtn;
	
//step2: initialization

public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


//step3:

public void inpKiteLogin2PagePin(String pinValue)
{
	pin.sendKeys(pinValue);
}


public void clickKiteLogin2PageContinueBtn() {
	cntBtn.click();
}
}
