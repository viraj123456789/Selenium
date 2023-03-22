package com.aspire.FrameWork.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWords 
{
	@Test (invocationCount = 2)               					  // keyWord = invocationCount
	public void method1()
	{
		Reporter.log("Method 1", true);
	}
	@Test(priority = -1)										// keyWord = priority
	public void method2()
	{
		Reporter.log("Method 2", true);
	}
	@Test (enabled = false)										// keyWord = enabled
	public void method3()
	{
		Reporter.log("Method 3", true);
	}
	@Test
	public void method4()
	{
		Reporter.log("Method 4", true);
	}
	@Test
	public void method5()
	{
		Reporter.log("Method 5", true);
	}
	
	@Test (timeOut = 1500)										// keyWord = timeOut
	public void login() throws InterruptedException	
	{ 
		Thread.sleep(2000);
		Reporter.log("login", true);
	}
	
	@Test (dependsOnMethods = {"login","method5"} )				// keyWord = dependsOnMethods
	public void logOut()
	{
		Reporter.log("logOut", true);
	}
}
