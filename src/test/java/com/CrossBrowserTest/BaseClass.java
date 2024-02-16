package com.CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.PageObject.HomepagePom;
import com.PageObject.LoginPom;
import com.PageObject.PaymentPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static LoginPom login;
	public static HomepagePom homepage;
	public static PaymentPom payment;
	
	@BeforeSuite
	public void setUp() {
		 login=new LoginPom(driver);
		 homepage=new HomepagePom(driver);
		 payment=new PaymentPom(driver);
	}
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		
		//driver.close();
	}
}
