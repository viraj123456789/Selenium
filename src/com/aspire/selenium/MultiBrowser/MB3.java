package com.aspire.selenium.MultiBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MB3 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
			
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		fblogin();
		
		System.setProperty("webdriver.gecko.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		driver = new FirefoxDriver();
		fblogin();
		
		System.setProperty("webdriver.edge.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\msedgedriver.exe");
		driver = new EdgeDriver();
		fblogin();
	}
	
	public static void fblogin() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@xyz.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@xyz");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();;
		Thread.sleep(15000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourse = ts.getScreenshotAs(OutputType.FILE);
		
		String randomName = RandomString.make(3);    //nhtd  ndyd   ht02 t3gd
		
		File destination=new File("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\"+randomName+".jpg");
		
		FileHandler.copy(sourse, destination);
		
		driver.close();
	
	}

}
