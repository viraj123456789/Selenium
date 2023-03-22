package com.aspire.selenium.PopUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
//getWindowHandle
		System.out.println("HomePage ID = "+driver.getWindowHandle());
		Thread.sleep(2000);
//getWindowHandles
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		Set<String> w = driver.getWindowHandles();
		for(String temp:w)
		{
		System.out.println(temp);
		}
		Thread.sleep(2000);
		
		ArrayList <String> al = new	ArrayList <String>(w);
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='win2']")).click();
		Thread.sleep(2000);
//		String w3 = driver.getWindowHandle();
//		System.out.println(w3);
//		al.add(w3);
		Set<String> w1 = driver.getWindowHandles();
		for(String temp:w1)
		{
		System.out.println(temp);
		}
		Thread.sleep(2000);
		ArrayList <String> al1 = new ArrayList <String>(w1);
		Thread.sleep(2000);		
		driver.switchTo().window(al1.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(al1.get(2));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(al1.get(1));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium", Keys.ENTER);
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		driver.switchTo().window(al1.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
