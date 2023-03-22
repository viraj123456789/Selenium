package com.aspire.selenium.iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame_3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/html/html_iframes.htm");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		String abc = driver.findElement(By.xpath("(//p[contains(text(),'Document content')])[2]")).getText();
		System.out.println(abc);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
