package com.aspire.selenium.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll 
{
	static String key = "webdriver.chrome.driver";
	static String url = "https://www.amazon.in/";
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
		 WebElement Element = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,550)","");
		js.executeScript("arguments[0].scrollIntoView();", Element);
		 
//		 Actions act = new Actions(driver);
//		 act.moveToElement(Element).perform();

//		driver.quit();
	}
	

}
