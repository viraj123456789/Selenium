package com.aspire.selenium.Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Edge_open 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\msedgedriver.exe");
		WebDriver d2 = new EdgeDriver();
	}
	
}
