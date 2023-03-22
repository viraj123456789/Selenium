package com.aspire.selenium.Browser_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome_Open 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // upCasting--- whenever we creating object of child class with ref of parent interface 
		
//		driver.get("file:///D:/Aspire/Registration_Class_August.html");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Thread.sleep(2000);
		

		
		driver.quit();
		
	}

}
