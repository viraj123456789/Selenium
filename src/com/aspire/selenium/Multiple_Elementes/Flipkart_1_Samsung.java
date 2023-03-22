package com.aspire.selenium.Multiple_Elementes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_1_Samsung 
{
	public static void main(String [] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
// close pop-up		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
// search box		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
//List & Price of products		
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		System.out.println("total no of products = "+ list.size());
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3']"));	
		
		for (int i = 0; i < list.size(); i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
					String allProducts = list.get(i).getText();
					String allPrice = price.get(i).getText();
					if(i==j)
					{
					System.out.println(allProducts+" = "+allPrice);
					}
	
			}
			
		}
		
		
		
//		for(WebElement temp:list)
//		{
//			System.out.println(temp.getText());
//		}
//		
		Thread.sleep(2000);
		
		
		driver.close();
		
	}

}
