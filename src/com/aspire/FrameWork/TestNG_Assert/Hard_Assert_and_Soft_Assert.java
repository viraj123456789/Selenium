package com.aspire.FrameWork.TestNG_Assert;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Assert_and_Soft_Assert
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
//		Assert.assertEquals(s1, s3, "if fails then give equal string value");  // fail
//		Reporter.log("Method 2", true);
		Assert.assertNotEquals(s1, s3, "if fails then give diff string value");
		Reporter.log("Method 3", true);
	    Assert.assertNotNull(s3, "if fails then string value is null");
		Reporter.log("Method 4", true);
	}
	@Test
	public void m2()
	{
		SoftAssert soft = new SoftAssert();
		soft.fail("perticularly failed");
				
		soft.assertNull(s3, "if fails then string value is not null");
		Reporter.log("Method 6", true);
		soft.assertTrue(b1);;
		Reporter.log("Method 7", true);
		soft.assertFalse(b2);;
		Reporter.log("Method 8", true);
	}
	
	

}
