package com.aspire.selenium.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		WebElement tab = driver.findElement(By.xpath("//div[@id='AuthorsTable']"));
		Actions act = new Actions(driver);	
		act.moveToElement(tab).perform();
		Thread.sleep(2000);
//Cell value
		System.out.println("*******Perticular Cell value******");
		 String text = driver.findElement(By.xpath("(//td[contains(text(),'and')])[2]")).getText();
		System.out.println(text);
		System.out.println();
		Thread.sleep(2000);
//print header -row
		System.out.println("*******Header******");
		List<WebElement> hrow = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//th"));
		System.out.println(hrow.size());
		
		for(WebElement temp:hrow)
		{
			System.out.print(temp.getText()+", ");
		}
		System.out.println();		System.out.println();
		Thread.sleep(2000);
//print single row
		System.out.println("*******Perticular row******");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]/td"));
		System.out.println("col count = "+ row.size());
		
		for(WebElement temp:row)
		{
			System.out.print(temp.getText()+", ");
		}
		System.out.println();
//		WebElement row = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]"));
//		System.out.println(row.getText());
		System.out.println();
		Thread.sleep(2000);
//print single column
		System.out.println("*******Perticular Column******");
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//td[1]"));
		System.out.println("row count = "+ col.size());
		
		for(WebElement temp:col)
		{
			System.out.println(temp.getText());
		}
		System.out.println();
		
		Thread.sleep(2000);
//print table
		System.out.println("*******Table******");
			
		Thread.sleep(2000);
//print header
		for(WebElement temp:hrow)
		{
			System.out.print(temp.getText()+"        ");
		}
		Thread.sleep(2000);
		System.out.println();
//rest of table print
		for (int i = 1; i <= col.size()+1; i++) 
		{
			List<WebElement> table = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr["+i+"]/td"));
			for(WebElement temp:table)
			{
				System.out.print(temp.getText()+"        ");
			}
			System.out.println();
		}
		
		Thread.sleep(2000);
//	specific row values
		System.out.println("*******Desired******");
		String exp = "Dan Brown";
		
		List<WebElement> des = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr/td[1]"));
			for(int i = 1;i<des.size();i++)
			{
				List<WebElement> des1 = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr["+i+"]/td[1]"));
				
				for(WebElement temp:des1)
				{
					if(temp.getText().equals(exp))
					{
						for (int j=1; j<=row.size(); j++ )
						{
						String rowValues = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+i+"]/td["+j+"]")).getText();
						System.out.print(rowValues+"    ");
						}
					}
				}
			}
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
