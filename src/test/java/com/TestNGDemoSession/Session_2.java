package com.TestNGDemoSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Session_2 {
	
	
	@Test
	public void m1() {
		System.out.println("Test M1");
		Assert.assertTrue(false); // Test case fail
	}
	
	@Test(enabled=false)
	public void m2() {
		System.out.println("Test M2");
	}
	
	@Test(invocationCount=3)
	public void m3() {
		System.out.println("Test M3");
	}
	
	@Test(dependsOnMethods="m1")
	public void m4() {
		System.out.println("Test M4");
	}
	

}
