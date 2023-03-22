package com.aspire.selenium.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopC 
{
	static String key = "webdriver.chrome.driver";
	static String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	static String value;
	protected static WebDriver driver;
	public static void main(String[] args)
	{		
		value = System.getProperty("user.dir")+"\\Softwares\\chromedriver.exe";
		System.setProperty(key, value );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get(url);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String text = driver.findElement(By.xpath("(//*[@class='card-title'])[2]")).getText();
		System.out.println(text);
		driver.quit();
	}
	

}
