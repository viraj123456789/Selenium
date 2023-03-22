package com.aspire.FrameWork.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2_for_suit 
{
	@Test(groups = "home")
	public void m2()
	{
		Reporter.log("m2",true);
	}
	@Test(groups = "signin")
	public void m3()
	{
		Reporter.log("m3",true);
	}

}
