package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomepage 
{
@FindBy(xpath="//span[@class='user-id']")private WebElement userID;

public  kiteHomepage (WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}
public void verifyuserID() 
{
	String actPN = userID.getText();
	String expPN = "DV1510";
	
	if(actPN.equals(expPN)) 
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}
