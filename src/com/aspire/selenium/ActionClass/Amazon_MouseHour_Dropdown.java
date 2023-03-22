package com.aspire.selenium.ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_MouseHour_Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // upCasting--- whenever we creating object of child class with ref of parent interface 
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		
		WebElement mh = driver.findElement(By.xpath("//a/span[@class='nav-line-2 ']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(mh).build().perform();
		
		Thread.sleep(2000);
		

		 List<WebElement> list = driver.findElements(By.xpath("(//a/span[@class='nav-text'])"));
		 System.out.println(list.size());
		for (WebElement temp:list) 
		{
			System.out.println(temp.getText());
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a/span[@class='nav-text'])[6]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
