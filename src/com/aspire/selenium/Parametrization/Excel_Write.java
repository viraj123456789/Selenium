package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Write 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\TestData\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		
		String [] a = {"Aspire","Training","Institute","Pune","400041"};
		for (int i = 0; i < a.length; i++) 
		{
			wbf.getSheet("Sheet3").createRow(i).createCell(0).setCellValue(a[i]);

		}
		
		wbf.getSheet("Sheet3").createRow(1).createCell(1).setCellValue("Viraj");
		
		wbf.getSheet("Sheet3").createRow(2).createCell(1).setCellValue("Pansare");
		
		wbf.getSheet("Sheet3").createRow(3).createCell(1).setCellValue("153624879");
		
		FileOutputStream write = new FileOutputStream("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\TestData\\Test1.xlsx");
		wbf.write(write);
		
	}

}
