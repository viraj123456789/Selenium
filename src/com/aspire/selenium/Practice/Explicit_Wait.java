package com.aspire.selenium.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_Wait 
{
	 WebDriver driver;
	@Test
	public void main() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Softwares\\chromedriver.exe" );
	driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	WebElement child_frame = driver.findElement(By.xpath("//iframe[@width='560']"));
	driver.switchTo().frame(child_frame);
//	WebElement button;
//	button= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Play'] ")));
//	button.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Play']"))).click();
	}

}
