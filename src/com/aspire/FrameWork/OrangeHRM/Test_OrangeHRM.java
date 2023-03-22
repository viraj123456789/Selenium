package com.aspire.FrameWork.OrangeHRM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_OrangeHRM extends BaseClass
{
	LoginPage l;
	HomePage hp;
	@BeforeClass
	public void browser_launch()
	{
		chrome();
		l = new LoginPage(driver);
		hp = new HomePage(driver);
	}
	@Test(priority = 1)
	public void LogoValidation() throws EncryptedDocumentException, IOException
	{
		l.logo();
	}
	@Test(priority = 2)
	public void LoginPannelValidation() throws EncryptedDocumentException, IOException
	{
		l.LoginPannel();
	}

	@Test (priority = 3)
	public void LogInValidation() throws EncryptedDocumentException, IOException
	{
		l.enterUserID();
		l.enterPassWord();
		l.Click();
	}
	@Test (dependsOnMethods = "LogInValidation")
	public void DashboardlValidation() throws EncryptedDocumentException, IOException
	{		
		hp.text(driver);
	}
	@AfterClass
	public void browser_close()
	{	
		driver.close();
	}

}
