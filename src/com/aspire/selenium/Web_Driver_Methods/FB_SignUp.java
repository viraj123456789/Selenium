package com.aspire.selenium.Web_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_SignUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse\\Eclipse File_new\\SeleniumPractice\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement( By.xpath("(//a[@role = 'button'])[2]")).click();
		Thread.sleep(2000);
// name		
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("Viraj");
		Thread.sleep(2000);
//surname
		driver.findElement(By.xpath("(//input[@type = 'text'])[3]")).sendKeys("Pansare");
		Thread.sleep(2000);
//email
		driver.findElement(By.xpath("(//input[@type = 'text'])[4]")).sendKeys("abc@xyz.com");
		Thread.sleep(2000);
//password
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("abc@123");
		Thread.sleep(2000);
//b.date
		driver.findElement(By.xpath("(//select[@id = 'day'])")).sendKeys("16");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//select[@id = 'month'])")).sendKeys("Mar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//select[@id = 'year'])")).sendKeys("1994");
		Thread.sleep(2000);
//gender		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(2000);
//sign up		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
//		driver.close();
	}

}
