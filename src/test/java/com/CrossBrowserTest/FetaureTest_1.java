package com.CrossBrowserTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FetaureTest_1 extends BaseClass{

	@Test
	public void Test_1() {
		
		
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
	}
}
