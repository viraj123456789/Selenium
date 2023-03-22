package com.aspire.FrameWork.OrangeHRM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage 
{
	@FindBy (xpath="//div[contains(text(),'Man')]") private WebElement emp;
	
	HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void text(WebDriver driver) throws EncryptedDocumentException, IOException
	{
//		String exp = Utility.excelString("Sheet1", 2,5);
//		
//		String act = emp.getText();
		boolean exp, act;
		exp= true;
		act= emp.isDisplayed();
		
		Assert.assertEquals(exp, act, "Home Page Text is Not Shown");
		Utility.ScreenShot(driver);
		
	}
}
