package com.aspire.FrameWork.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void TestCase1()
	{
//		System.out.println(" test 1");
		Reporter.log(" test 1 and pass", true);
	}
	@Test
	public void TestCase2()
	{
//		System.out.println(" test 2");
		Reporter.log(" test 2", true);
	}

}
