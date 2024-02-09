package com.TestNGDemoSession;

import org.testng.annotations.Test;

public class Session_4 {

	@Test(groups= {"Regression"})
	public void r1() {
		System.out.println("Test R1");
	}
	
	@Test(groups= {"Critical Regression","Regression"})
	public void r2() {
		System.out.println("Test R2");
	}
}
