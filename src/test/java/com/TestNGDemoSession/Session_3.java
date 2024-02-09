package com.TestNGDemoSession;

import org.testng.annotations.Test;

public class Session_3 {

	
	@Test(groups= {"Regression"})
	public void p1() {
		System.out.println("Test P1");
	}
	
	@Test(groups= {"Critical Regression"})
	public void p2() {
		System.out.println("Test P2");
	}
	
	@Test(groups= {"Regression"})
	public void p3() {
		System.out.println("Test P3");
	}
	
	@Test(groups= {"Critical Regression"})
	public void p4() {
		System.out.println("Test P4");
	}
}
