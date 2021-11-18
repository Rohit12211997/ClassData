package POM_with_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_with_pagefactory.kiteHomepage;
import POM_with_pagefactory.kitelogin1page;
import POM_with_pagefactory.kitelogin2page;

public class kiteLoginTest
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\shiv\\\\Desktop\\\\selenium software\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	kitelogin1page login1=new kitelogin1page(driver);
	login1.enterUN();
	Thread.sleep(3000);
	login1.enterPWD();
	Thread.sleep(3000);
	login1.clickonloginbutton();
	
	kitelogin2page login2=new kitelogin2page(driver);
	Thread.sleep(3000);
	login2.enterPIN();
	Thread.sleep(3000);
	login2.ctnbtn();
	
	kiteHomepage home=new kiteHomepage(driver);
	home.verifyuserID();
	
	Thread.sleep(3000);
	driver.close();
}
}
