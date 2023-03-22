package com.aspire.FrameWork.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 
{
	@Test
	public void m1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
//	get URL
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@class='nav-item has-treeview'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@class='nav-item has-treeview'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='nav-item has-treeview menu-open']/ul/li[6]/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("(//a[@class='float-left'])[1]")).getText();
		System.out.println(a);
		Thread.sleep(2000);
		
		String b = driver.findElement(By.xpath("(//div[@class='card-body'])[3]")).getText();
		System.out.println(b);
		Thread.sleep(2000);
		String c = driver.findElement(By.xpath("(//h3[@class='card-title'])[4]")).getText();
		System.out.println(c);
		Thread.sleep(2000);
		List<WebElement> d = driver.findElements(By.xpath("(//table[@role='grid'])[1]/thead/tr/th"));
		for(WebElement temp:d)
		{
			System.out.println(temp.getText());
		}
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
