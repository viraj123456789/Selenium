package com.aspire.FrameWork.POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	@FindBy (xpath="(//img[@alt='logo.png'])[2]") private WebElement logo;
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	verify Logo after login [DashBoard]
	public void LogoVerify(boolean explogo) throws InterruptedException
	{
//		boolean explogo = true;
		boolean actlogo = logo.isDisplayed();
		if(explogo == actlogo)
		{
			System.out.println("Logo Verification Test is Pass");
		}
		else
		{
			System.out.println("Logo Verifiaction Test is Fail");
		}
		
		Thread.sleep(2000);
	}


}
