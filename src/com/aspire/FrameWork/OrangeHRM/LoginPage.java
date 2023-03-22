package com.aspire.FrameWork.OrangeHRM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
	@FindBy (xpath="//div[@class='organization-logo shadow']") private WebElement Logo;
	@FindBy (xpath="//div[@class='login-form shadow']") private WebElement lp;
	@FindBy (xpath="//input[@id='txtUsername']") private WebElement un;
	@FindBy (xpath="//input[@id='txtPassword']") private WebElement pass;
	@FindBy (xpath="//button[@type='submit']") private WebElement click;
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logo() throws EncryptedDocumentException, IOException
	{
		boolean exp = Utility.excelBoolean("Sheet1", 2,1 );
		boolean act = Logo.isDisplayed();
		Assert.assertEquals(exp, act,"Logo is not displayed");
		
	}
	public void LoginPannel() throws EncryptedDocumentException, IOException
	{
		boolean exp = Utility.excelBoolean("Sheet1", 2,2 );
		boolean act = lp.isDisplayed();
		Assert.assertEquals(exp, act,"Login Pannel is not displayed");
		
	}
	public void enterUserID() throws EncryptedDocumentException, IOException
	{
		un.sendKeys(Utility.excelString("Sheet1", 2, 3));
		
	}
	public void enterPassWord() throws EncryptedDocumentException, IOException
	{
		pass.sendKeys(Utility.excelString("Sheet1", 2, 4));
	}
	public void Click()
	{
		click.click();
	}
	

}
