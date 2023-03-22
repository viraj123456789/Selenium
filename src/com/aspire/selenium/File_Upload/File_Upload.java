package com.aspire.selenium.File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
        String baseUrl = "http://demo.guru99.com/test/upload/";
      Thread.sleep(2000);
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("D:\\Aspire\\Notes\\All Framework-HandWritten.pdf");
        Thread.sleep(2000);

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        Thread.sleep(2000);
        
       String text = driver.findElement(By.xpath("(//div[@class='formbuttons'])[2]")).getText();
       String text1 = driver.findElement(By.xpath("//center[contains(text(),'file')]")).getText();
      
        System.out.println(text);
        System.out.println(text1);
       
        driver.close();
        
        
        }
}


