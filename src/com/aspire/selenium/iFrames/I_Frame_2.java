package com.aspire.selenium.iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
//	switch selenium focus from homepage to iFrame
//  By id & 2. name
		driver.switchTo().frame("frame1");
//		driver.switchTo().frame(3);
		Thread.sleep(2000);	
//	by WebElement
//		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		driver.switchTo().frame(parentFrame);
//	getting text from parent Frame	
		String text0 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("Text from parent class = "+ text0);
		Thread.sleep(2000);
//	parent frame to child frame by WebElement
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
		driver.switchTo().frame(childFrame);
		Thread.sleep(2000);
//	getting text from child Frame
		String text = driver.findElement(By.xpath("//p[contains(text(),' ')]")).getText();
		System.out.println("Text from child class = "+ text);
		Thread.sleep(2000);
//	child to parent
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
//	getting text from parent Frame
		 String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		 System.out.println("Text from parent class = "+ text1);
		Thread.sleep(2000);
// parent to child		
		driver.switchTo().frame(childFrame);
		Thread.sleep(2000);
//	getting text from child Frame
		String textch = driver.findElement(By.xpath("//p[contains(text(),' ')]")).getText();
		System.out.println("Text from child class = "+ textch);
		Thread.sleep(2000);
		
//	child to Homepage directly
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
//  home page text 		
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'page')]")).getText();
		System.out.println("Text from default class = "+ text2);
		Thread.sleep(2000);
//	alternate xPath approach-    //div[@id='framesWrapper']/div[1]
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
