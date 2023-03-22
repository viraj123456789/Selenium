package com.aspire.selenium.Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_open 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.internetexplorer.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		
	}

}
