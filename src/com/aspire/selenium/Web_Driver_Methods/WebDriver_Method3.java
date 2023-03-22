package com.aspire.selenium.Web_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();   //upcasting
		Thread.sleep(2000);
		//get url
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		verify logo is Displayed or not
		boolean logoDisplay = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(logoDisplay);     // true
		if (logoDisplay=true)
		{
			System.out.println("Facebook logo is displayed");
		}
		else
		{
			System.out.println("Facebook logo is NOT displayed");
		}
		Thread.sleep(2000);
		
//		verify email field is Enabled
		boolean emailEnable = driver.findElement(By.xpath("//input[@name='email']")).isEnabled();
		System.out.println("Email Textbox is enabled = "+emailEnable);
		Thread.sleep(2000);
//		create new Account click
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
//		isSelected
//		before click on Male gender
		boolean beforeClick = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		System.out.println("Male Gender is selected= "+beforeClick);
//		click
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
//		After click
		boolean afterClick = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		System.out.println("Male Gender is selected= "+afterClick);
		Thread.sleep(2000);
		driver.close();
		
	}

}
