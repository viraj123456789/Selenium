package com.aspire.selenium.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/python/");
		
		Thread.sleep(2000);
		WebElement mh = driver.findElement(By.xpath("(//h2[text()='Python Examples'])[2]"));
		Actions act = new Actions(driver);
//		act.moveToElement(mh).contextClick().build().perform();
		act.contextClick(mh).perform();

		Thread.sleep(2000);

		
		
		
		Thread.sleep(2000);
		
	}

}
