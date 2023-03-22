package com.aspire.selenium.Web_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// findElement()  , locators
public class WebDriver_Methods2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Aspire/Registration_Class_August.html");
		System.out.println("Title of Web Page is = "+driver.getTitle());
			Thread.sleep(2000);
//id - name
		driver.findElement(By.id("1234")).sendKeys("Viraj");
			Thread.sleep(2000);
//name - city
		driver.findElement(By.name("local")).sendKeys("Sangamner");
			Thread.sleep(2000);
		driver.findElement(By.name("local")).clear();
		driver.findElement(By.name("local")).sendKeys("India");
			Thread.sleep(2000);
//className - mobile
		driver.findElement(By.className("contact")).sendKeys("1234567890");
			Thread.sleep(2000);
//tagName - password
//		driver.findElement(By.tagName("input")).sendKeys("xyz@123");
		driver.findElement(By.className("protected")).sendKeys("xyz@123");
			Thread.sleep(2000);
//linktext - link
		driver.findElement(By.linkText("Visit Our Facebook Page")).click();
			Thread.sleep(2000);
		driver.navigate().back();
			Thread.sleep(2000);
//partialLinkText - link
		driver.findElement(By.partialLinkText("zon")).click();
			Thread.sleep(2000);
		driver.navigate().back();
			Thread.sleep(2000);
//cssSelector - cource
		driver.findElement(By.cssSelector("body > input[type=checkbox]:nth-child(27)")).click();
			Thread.sleep(2000);
//xPath - gender
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			Thread.sleep(2000);
		driver.close();
	}

}
