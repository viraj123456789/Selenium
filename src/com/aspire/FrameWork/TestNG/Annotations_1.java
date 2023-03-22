package com.aspire.FrameWork.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Annotations sequence ==>>   
//Suit <- Group <- Test <- Class <- Method <- testCases(@Test)

public class Annotations_1 
{
	@BeforeClass
	public void m1()
	{
		Reporter.log("m1",true);
	}
	@AfterClass
	public void m2()
	{
		Reporter.log("m2",true);
	}
	@BeforeMethod
	public void m3()
	{
		Reporter.log("m3",true);
	}
	@AfterMethod
	public void m4()
	{
		Reporter.log("m4",true);
	}
	@Test
	public void m5()
	{
		Reporter.log("m5",true);
	}
	@Test
	public void m6()
	{
		Reporter.log("m6",true);
	}
	@Test
	public void m7()
	{
		Reporter.log("m7",true);
	}
	
	@BeforeTest
	public void m11()
	{
		Reporter.log("m11",true);
	}
	@AfterTest
	public void m12()
	{
		Reporter.log("m12",true);
	}
	
	@BeforeGroups
	public void m21()
	{
		Reporter.log("m21",true);
	}
	@AfterGroups
	public void m22()
	{
		Reporter.log("m22",true);
	}
	@BeforeSuite
	public void m31()
	{
		Reporter.log("m31",true);
	}
	@AfterSuite
	public void m32()
	{
		Reporter.log("m32",true);
	}
//	
	
	

}
