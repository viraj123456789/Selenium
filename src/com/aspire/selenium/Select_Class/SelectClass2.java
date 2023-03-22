package com.aspire.selenium.Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
//	get url
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);

		WebElement ms = driver.findElement(By.xpath("//select[@id='second']"));
		Select s1 = new Select(ms);
		boolean result = s1.isMultiple(); System.out.println(result);
//get all options		
		List<WebElement> opt = s1.getOptions();
		for(WebElement temp : opt)
		{
			System.out.println(temp.getText());
		}
		Thread.sleep(2000);
//	Multiple selection
		s1.selectByIndex(0);Thread.sleep(2000);
		s1.selectByIndex(1);Thread.sleep(2000);
		s1.selectByVisibleText("Bonda");Thread.sleep(2000);
		s1.selectByValue("burger");
		
		Thread.sleep(2000);
//	deselect all	
		s1.deselectAll();
		Thread.sleep(2000);
			
//	get all selected option
		List<WebElement> options = s1.getAllSelectedOptions();
		for(WebElement temp:options)
		{
			System.out.println(temp.getText());
		}
		Thread.sleep(2000);
////	deselect all	
//		s1.deselectAll();
//		Thread.sleep(2000);
//		
		driver.close();
	}	

}
