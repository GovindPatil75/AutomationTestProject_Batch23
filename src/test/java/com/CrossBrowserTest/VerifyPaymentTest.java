package com.CrossBrowserTest;

import org.testng.annotations.Test;

public class VerifyPaymentTest extends BaseClass{
	
	@Test
	public void verifyTest1() {
		
		payment.sendValueToelement("Test");
		
	}

}
