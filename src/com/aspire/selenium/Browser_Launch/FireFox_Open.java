package com.aspire.selenium.Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Open 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.gecko.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();  
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
		
	}
	
	

}
