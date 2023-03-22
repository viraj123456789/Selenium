package com.aspire.selenium.ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(3000);
		
			
		
		TakesScreenshot ss = (TakesScreenshot)driver ;
		File source = ss.getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		File destination = new File("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\ScreenShot\\"+ random +".jpeg");
		FileHandler.copy(source, destination);
	}

}
