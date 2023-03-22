package com.aspire.selenium.MultiBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MB2 
{
	static WebDriver driver;
	static String Browser ="chrome";
	public static void main(String[] args) throws InterruptedException 
	{
		if(Browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(Browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		driver = new FirefoxDriver();
		}
		
		else
		{
		System.setProperty("webdriver.edge.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@xyz.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@xyz");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();;
		Thread.sleep(2000);
		
		driver.close();
	
	}

}
