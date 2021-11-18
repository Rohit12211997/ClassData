package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// POM class 1
public class kitelogin1page 
{
	// step1=declaration----> global
	 @FindBy(xpath="//input[@type='text']")private WebElement UN;
	 @FindBy(xpath="//input[@type='password']")private WebElement PWD;
	 @FindBy(xpath="//button[@type='submit']")private WebElement login;
	 
	 // step2 : initilazation

	 public kitelogin1page(WebDriver driver) 
{
		 PageFactory.initElements(driver, this);
}
	 // step3 : usage
	 
	 public void enterUN()
	 {
		 UN.sendKeys("DV1510");
	 }
	 public void enterPWD() 
	 {
		 PWD.sendKeys("Year@123");
	 }
	 public void clickonloginbutton()
	 {
		 login.click();
	 }
}