package com.aspire.FrameWork.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3_for_suit 
{
	@Test(groups = "logout")
	public void m4()
	{
		Reporter.log("m4",true);
	}
	@Test(groups = "home")
	public void m5()
	{
		Reporter.log("m5",true);
	}
	@Test (groups = "signin")
	public void m6()
	{
		Reporter.log("m6",true);
	}

}
