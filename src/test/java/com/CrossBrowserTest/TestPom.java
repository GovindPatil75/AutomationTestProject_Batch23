package com.CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPom {
	
	
	@Test
	public void verifyTest1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getEmail().sendKeys("Test");
		login.getPassword().sendKeys("12345678");
		login.getLogintBtn().click();
		
		
	}

}
