package com.aspire.selenium.ActionClass;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Customized_Listbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions act = new Actions(driver);
		
//		create new Account click
		WebElement cna = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		act.moveToElement(cna).click().build().perform();
		
		Thread.sleep(2000);
//		Select DOB
//		Date
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		act.moveToElement(date).click().build().perform();
		for (int i = 0; i <=6; i++) 
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
//		Select DOB
//		MOnth
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		act.moveToElement(month).click().build().perform();
		for (int i = 0; i <=8; i++) 
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		act.moveToElement(year).click().build().perform();
		for (int i = 0; i <=27; i++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}