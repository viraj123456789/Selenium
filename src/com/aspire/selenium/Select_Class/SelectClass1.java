package com.aspire.selenium.Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
//	get url
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//	create new Account click
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
//	Select DOB		
//	Day
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		WebElement def_Day = s1.getFirstSelectedOption();
		System.out.println(def_Day.getText());	
		System.out.println(s1.getOptions().size());
		Thread.sleep(2000);
		s1.selectByIndex(15);
		Thread.sleep(2000);
//	Month
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		System.out.println(s2.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s2.selectByValue("3");
		Thread.sleep(2000);
//	Year
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		System.out.println(s3.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s3.selectByVisibleText("1994");
		List<WebElement> xyz = s3.getAllSelectedOptions();
		for(WebElement temp : xyz)
		{
			System.out.println(temp.getText());
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
