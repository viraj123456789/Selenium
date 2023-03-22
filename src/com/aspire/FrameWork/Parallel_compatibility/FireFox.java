package com.aspire.FrameWork.Parallel_compatibility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox 
{
	@Test
	public void fireFoxLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
