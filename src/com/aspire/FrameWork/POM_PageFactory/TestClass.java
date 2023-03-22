package com.aspire.FrameWork.POM_PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main (String [] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
//	get URL
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		
		FileInputStream file = new FileInputStream("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\TestData\\TestData1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		Row row = wbf.getSheet("Sheet1").getRow(1);
		
		String expTitle = row.getCell(0).getStringCellValue();
		boolean expCBresult = row.getCell(1).getBooleanCellValue();
		boolean explogo =  row.getCell(2).getBooleanCellValue();
		String un = row.getCell(3).getStringCellValue();
		String pwd =  row.getCell(4).getStringCellValue();
		
		LoginWebPage lp = new LoginWebPage(driver);
		
//		lp.titalVerify(expTitle);
		lp.checkboxVerify(expCBresult);
		lp.LoginVerify(un, pwd);
		
		Dashboard d = new Dashboard(driver);
		d.LogoVerify(explogo);
		
		
		
		Thread.sleep(2000);
		driver.close();
	}	

}
