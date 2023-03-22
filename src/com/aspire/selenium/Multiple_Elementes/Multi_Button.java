package com.aspire.selenium.Multiple_Elementes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Button 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		
		  List<WebElement> a = driver.findElements(By.xpath("//input"));
		  
		  System.out.println("how many buttons are there = "+a.size());
		  
		  for(WebElement temp:a)
		  {
			 temp.click();
			 Thread.sleep(2000);
		  }
		  
		  Thread.sleep(2000);
		  driver.close();
		
	}

}
