package com.aspire.selenium.iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_1   
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//	get-https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
//	switch to -iframe by index
//		driver.switchTo().frame(0);
//  By id & 2. name	
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
//	getText
		String text = driver.findElement(By.xpath("//h2[text()='My First JavaScript']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
//	click on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
//	getTExt after click
		String text1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Text after clicking button = "+text1);
		Thread.sleep(2000);
//	switch to default content
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
//	CLick on Run button
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		Thread.sleep(2000);
//	getTExt at default frame		
		String text2 = driver.findElement(By.xpath("//span[@id='framesize']")).getText();
		System.out.println("Text at default frame = "+text2);
//  CLick on get web site button		
		driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
}
