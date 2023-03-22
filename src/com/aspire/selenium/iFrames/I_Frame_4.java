package com.aspire.selenium.iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frm2");
		
		String abc = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		System.out.println(abc);
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/\"]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
