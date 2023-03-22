package com.aspire.FrameWork.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable 
{
	@Test
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
//	get URL
		driver.get("https://www.census2011.co.in/facts/largestates.html");
		Thread.sleep(2000);
		
//		List<WebElement> d = driver.findElements(By.xpath("//table//th"));
//		for(WebElement temp:d)
//		{
//			System.out.println(temp.getText());
//		}
//		Thread.sleep(2000);
//		
//		String b = driver.findElement(By.xpath("//table//tr[1]/td[2]")).getText();
//		System.out.println(b);
//		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.xpath("//td[2]"));
		for(WebElement temp:a)
		{
			System.out.println(temp.getText());
		}
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
