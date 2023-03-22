package com.aspire.selenium.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_down 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espn.in/nba/stats/player");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='AnchorLink loadMore__link']")).click();
		Thread.sleep(2000);
		WebElement tab = driver.findElement(By.xpath("(//td[text()='13.4'])[2]"));
		Actions act = new Actions(driver);	
		act.moveToElement(tab).perform();
		Thread.sleep(2000);
		
	}

}
