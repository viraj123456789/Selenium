package com.aspire.FrameWork.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1_for_suit 
{
	@Test(groups = "signin")
	public void m1()
	{
		Reporter.log("m1",true);
	}
	

}
