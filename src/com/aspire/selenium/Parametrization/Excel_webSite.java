package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_webSite 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		FileInputStream file = new FileInputStream("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\TestData\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		
		Thread.sleep(3000);
// name		
		
		String name = wbf.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys(name);
		Thread.sleep(3000);
//surname
		String surname = wbf.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("(//input[@type = 'text'])[3]")).sendKeys(surname);
		Thread.sleep(3000);
//mobile
		
		String mobile = wbf.getSheet("Sheet1").getRow(6).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type = 'text'])[4]")).sendKeys(mobile);
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
