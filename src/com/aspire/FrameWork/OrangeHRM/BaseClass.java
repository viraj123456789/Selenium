package com.aspire.FrameWork.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	static String key = "webdriver.chrome.driver";
	static String url = "https://abc1234xyz-trials77.orangehrmlive.com/auth/login";
	static String value;
	static WebDriver driver;
	public static void chrome() 
	{		
		value = System.getProperty("user.dir")+"\\Softwares\\chromedriver.exe";
		System.setProperty(key, value );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
	}

}
