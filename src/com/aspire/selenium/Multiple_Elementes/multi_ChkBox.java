package com.aspire.selenium.Multiple_Elementes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_ChkBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		
		  List<WebElement> a = driver.findElements(By.xpath("//input[@type='checkbox']"));
		  
		  System.out.println("how many buttons are there = "+a.size());
		  
		  for(int i = 1; i <= a.size(); i++)
		  {
			 WebElement temp = driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]"));
			System.out.println("CheckBox No. "+i+" is Enable = "+temp.isEnabled());
		  }
		  Thread.sleep(2000);
		  for(WebElement temp:a)
		  {
			 temp.click();
			 Thread.sleep(2000);
		  }
		  
		  Thread.sleep(2000);
		  driver.close();
		
	}

}
