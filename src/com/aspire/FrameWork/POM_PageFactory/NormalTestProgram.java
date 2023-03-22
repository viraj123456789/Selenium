package com.aspire.FrameWork.POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalTestProgram 
{
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
//	get URL
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
//	verify Title
		String expTitle = "Your store. Login";
		String actTitle = driver.getTitle();
		System.out.println("WebPage Title = " + actTitle);
		if(expTitle.equals(expTitle))
		{
			System.out.println("Tital Verification Test is Pass");
		}
		else
		{
			System.out.println("Tital Verifiaction Test is Fail");
		}
		Thread.sleep(2000);	
//	Verify Checkbox is selected or not
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean expCBresult = true;
		boolean actCBresult = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if(expCBresult == actCBresult)
		{
			System.out.println("CheckBox Verification Test is Pass");
		}
		else
		{
			System.out.println("CheckBox Verifiaction Test is Fail");
		}
		
		Thread.sleep(2000);
//	enter email
		driver.findElement(By.xpath("//input[@class='email valid']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='email valid']")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
//	enter password
		driver.findElement(By.xpath("//input[@class='password']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("admin");
		Thread.sleep(2000);
//	click on Login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
//	verify Logo after login [DashBoard]
		boolean explogo = true;
		boolean actlogo = driver.findElement(By.xpath("(//img[@alt='logo.png'])[2]")).isDisplayed();
		if(explogo == actlogo)
		{
			System.out.println("Logo Verification Test is Pass");
		}
		else
		{
			System.out.println("Logo Verifiaction Test is Fail");
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
