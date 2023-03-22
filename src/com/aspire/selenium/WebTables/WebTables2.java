package com.aspire.selenium.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		Thread.sleep(2000);
		System.out.println("*******Desired******");
		String exp = "Maharashtra";
		List<WebElement> row = driver.findElements(By.xpath("//table//tr[1]/td"));
		System.out.println("col count = "+ row.size());
		List<WebElement> des = driver.findElements(By.xpath("//table//tr/td[2]"));
			for(int i = 1;i<des.size();i++)
			{
				List<WebElement> des1 = driver.findElements(By.xpath("//table//tr["+i+"]/td[2]"));
				
				for(WebElement temp:des1)
				{
					if(temp.getText().equals(exp))
					{
						for (int j=1; j<row.size(); j++ )
						{
						String rowValues = driver.findElement(By.xpath("//table//tr["+i+"]/td["+j+"]")).getText();
						System.out.print(rowValues+"    ");
						
						}
					}
				}
			}
		
			
		Thread.sleep(2000);
		driver.close();
		
	}

}
