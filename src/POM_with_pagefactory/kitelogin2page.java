package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2page 
{
	// step1----> declaration
@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
@FindBy(xpath="//button[@type='submit']")private WebElement ctnbtn;

// step2----> initilization
public kitelogin2page(WebDriver driver) 
{
	 PageFactory.initElements(driver, this);
}
// srep3----> usage

public void enterPIN()
{
	PIN.sendKeys("959594");
}
public void ctnbtn() 
{
ctnbtn.click();
}
}
