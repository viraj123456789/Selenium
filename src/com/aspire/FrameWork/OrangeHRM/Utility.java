package com.aspire.FrameWork.OrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
static Workbook wbf;
	
	public static String excelString(String SheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\OrangeHRM.xlsx");
		wbf = WorkbookFactory.create(file);
		String StrinData = wbf.getSheet(SheetName).getRow(rowNo - 1).getCell(cellNo - 1).getStringCellValue();
		return StrinData;
	}
	
	public static boolean excelBoolean(String SheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\OrangeHRM.xlsx");
		wbf = WorkbookFactory.create(file);
		boolean booleanData = wbf.getSheet(SheetName).getRow(rowNo - 1).getCell(cellNo - 1).getBooleanCellValue();
		return booleanData;
	}
	public static void ScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String timeStamp = d.toString().replace(":", "_").replace(" ", "_");
		File dest = new File(System.getProperty("user.dir")+"\\ScreenShot\\"+ timeStamp +".jpg");
		
		FileHandler.copy(source, dest);
	}

}
