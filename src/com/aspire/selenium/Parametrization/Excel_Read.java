package com.aspire.selenium.Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Read 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\TestData\\Test1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		
		System.out.println(wbf.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue());
		
		double pin = wbf.getSheet("Sheet2").getRow(5).getCell(5).getNumericCellValue();
		System.out.println(pin);
		
		long mob = (long) wbf.getSheet("Sheet1").getRow(6).getCell(5).getNumericCellValue();
		System.out.println(mob);
		
		boolean bool = wbf.getSheet("Sheet1").getRow(7).getCell(2).getBooleanCellValue();
		System.out.println(bool);
		
		short col = wbf.getSheet("Sheet1").getRow(1).getLastCellNum();
		System.out.println("col count of row 1 is = "+col);
//		to print complete row
		
		for (int i = 0; i <col; i++) 
		{
			 String a = wbf.getSheet("Sheet1").getRow(1).getCell(i).getStringCellValue();
			 System.out.print(a+", ");
		}
		System.out.println();
		
		int row = wbf.getSheet("Sheet1").getLastRowNum();
		System.out.println("row count  is = "+ row);
		
//		to print complete col
		for (int i = 0; i < row; i++) 
		{
			String x = wbf.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(x);
		}
		
		
		CellType type = wbf.getSheet("Sheet1").getRow(2).getCell(5).getCellType();
		System.out.println("Cell Type = "+ type);
				
	}

}
