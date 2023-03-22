package com.aspire.FrameWork.TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_CLass 
{
	String s1="abcd";
	String s2="abcd";
	String s3="efgh";
	String s4="";
	boolean b1 = true;
	boolean b2 = false;
	
	@Test
	public void m1()
	{
		Assert.assertEquals(s1, s2, "if fails then give equal string value");
		Reporter.log("Method 1", true);
	}
	@Test
	public void m2()
	{
		Assert.assertEquals(s1, s2, "if fails then give equal string value");
		Reporter.log("Method 2", true);
	}
	@Test
	public void m3()
	{
		Assert.assertNotEquals(s1, s3, "if fails then give diff string value");
		Reporter.log("Method 3", true);
	}
	@Test
	public void m4()
	{
		Assert.assertNotNull(s3, "if fails then string value is null");
		Reporter.log("Method 4", true);
	}
	@Test
	public void m5()
	{
		Assert.assertNull(s4, "if fails then string value is not null");
		Reporter.log("Method 5", true);
	}
	@Test
	public void m6()
	{
//		Assert.fail("perticularly failed");;
		Reporter.log("Method 6", true);
	}
	@Test
	public void m7()
	{
		Assert.assertTrue(b1);;
		Reporter.log("Method 7", true);
	}
	@Test
	public void m8()
	{
		Assert.assertFalse(b2);;
		Reporter.log("Method 8", true);
	}

}
