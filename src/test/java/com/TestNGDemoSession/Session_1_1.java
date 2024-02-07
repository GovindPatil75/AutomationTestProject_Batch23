package com.TestNGDemoSession;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_1_1 {

	ChromeDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() {
		System.out.println("Browser open");
		/*
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		*/
	}
	
	@Test(priority=1)
	public void xyz() {
		System.out.println("xyz");
		//driver.findElement(By.xpath("")).click();
	}
	
	@Test(priority=0)
	public void pqr() {
		System.out.println("pqr");
	}
	
	@Test(priority=-2)
	public void abc() {
		System.out.println("abc");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Browser close");
		
		//driver.close();
	}
}
