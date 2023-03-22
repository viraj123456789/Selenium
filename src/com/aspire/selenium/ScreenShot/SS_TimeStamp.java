package com.aspire.selenium.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class SS_TimeStamp 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.gecko.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(3000);
		
		TakesScreenshot ss = (TakesScreenshot)driver ;
		File source = ss.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String timeStamp = d.toString().replace(":","_").replace(" ","_");
		System.out.println(timeStamp);
		File destination = new File("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\ScreenShot\\"+ timeStamp+".jpeg");
		FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		driver.close();
	}

}
