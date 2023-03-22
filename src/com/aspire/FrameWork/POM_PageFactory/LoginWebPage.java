package com.aspire.FrameWork.POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage 
{
	@FindBy (xpath="//input[@type='checkbox']") private WebElement chbox;
	@FindBy (xpath="//input[@class='email valid']") private WebElement id;
	@FindBy (xpath="//input[@class='password']") private WebElement pass;
	@FindBy (xpath="//button[@type='submit']") private WebElement lgbutton;
	
	
	public LoginWebPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
//	verify Title
//	public void titalVerify(String expTitle)
//	{
////		String expTitle = "Your store. Login";           //  getting in Test class
//		String actTitle = driver.getTitle();
//		System.out.println("WebPage Title = " + actTitle);
//		if(expTitle.equals(expTitle))
//		{
//			System.out.println("Tital Verification Test is Pass");
//		}
//		else
//		{
//			System.out.println("Tital Verifiaction Test is Fail");
//		}
//		Thread.sleep(2000);	
//	}
//	Verify Checkbox is selected or not
	public void checkboxVerify(boolean expCBresult) throws InterruptedException
	{
//		boolean expCBresult = true;
		chbox.click();									//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean actCBresult = chbox.isSelected();		//driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if(expCBresult == actCBresult)
		{
			System.out.println("CheckBox Verification Test is Pass");
		}
		else
		{
			System.out.println("CheckBox Verifiaction Test is Fail");
		}
		Thread.sleep(2000);
	}
//	enter email
	public void LoginVerify(String un, String pwd) throws InterruptedException
	{
		id.clear();
		Thread.sleep(1000);
		id.sendKeys(un);     			  //id.sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
//	enter password
	
		pass.clear();
		Thread.sleep(1000);
		pass.sendKeys(pwd);				//pass.sendKeys("admin");
		Thread.sleep(2000);
//	click on Login
	
		lgbutton.click();
		Thread.sleep(2000);
	}

		

}
