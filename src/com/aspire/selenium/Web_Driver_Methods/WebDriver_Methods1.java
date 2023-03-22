package com.aspire.selenium.Web_Driver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//get(), getTitle(), manage(), Navigate(), getCurrentUrl(), close(), quite(), 
public class WebDriver_Methods1      
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // upCasting--- whenever we creating object of child class with ref of parent interface 
//get()		
		driver.get("https://www.geeksforgeeks.org/java/?ref=shm");
	Thread.sleep(2000);
//getTitle()		
		System.out.println(driver.getTitle());
//manage()
		Dimension size = driver.manage().window().getSize();
		System.out.println("Default size ="+size);
		System.out.println("Default Position ="+driver.manage().window().getPosition());
	Thread.sleep(2000);
		driver.manage().window().maximize();
	Thread.sleep(2000);
		System.out.println("Maximun size ="+driver.manage().window().getSize());     // alternative writing		
	Thread.sleep(2000);
		Dimension d2 = new Dimension(1000,1000);
		Dimension d1 = new Dimension(850,850);
		driver.manage().window().setSize(d1);
	Thread.sleep(3000);
		driver.manage().window().setSize(d2);
	Thread.sleep(3000);
		driver.manage().window().minimize();
	Thread.sleep(3000);
		driver.manage().window().maximize();
	Thread.sleep(3000);
		 Point p = driver.manage().window().getPosition();
		System.out.println("Current Position ="+p);
	Thread.sleep(3000);
		Point p1 = new Point(100,100);
		driver.manage().window().setPosition(p1);
		System.out.println("New Position ="+ driver.manage().window().getPosition());
	Thread.sleep(3000);
//Navigate()		
		driver.navigate().to("https://www.w3schools.com/java/default.asp");
	Thread.sleep(3000);
		driver.navigate().back();
	Thread.sleep(3000);
		driver.navigate().forward();
	Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(3000);
//getCurrentUrl() 	
		System.out.println("Current Working URL = "+driver.getCurrentUrl());
//close()
		driver.close();
//quite(),
//		driver.quit();
	}

}
