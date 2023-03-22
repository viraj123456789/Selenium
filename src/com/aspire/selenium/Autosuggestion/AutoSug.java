package com.aspire.selenium.Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSug 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("marvel");
		Thread.sleep(2000);
//		List<WebElement> sugg = driver.findElements(By.xpath("//div[@role='option']"));  // (//ul[@role='listbox'])[2]/li  
		List<WebElement> sugg = driver.findElements(By.xpath("(//ul[@role='listbox'])//li"));
		Thread.sleep(2000);
		System.out.println(sugg.size());
		Thread.sleep(2000);
// print all		
		for(WebElement temp:sugg)
		{
//			String list = temp.getText();
//			System.out.println(list);
						
			System.out.println(temp.getText());
		}
		Thread.sleep(2000);
		String exp = "marvel phase 6";
		for(WebElement temp:sugg)
		{
			String list = temp.getText();
			if(list.equals(exp))
			{
				temp.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
