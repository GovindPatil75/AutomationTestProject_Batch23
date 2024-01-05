package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_Locator_ID {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Element Identify -- Locator -- ID
		
		//enabled and dispalyed == T == Action 
		
		WebElement email=driver.findElement(By.id("email"));
		custom_Sendkeys(email,"Test");
		
//		if(email.isEnabled() && email.isDisplayed()) {
//			email.sendKeys("BugSpotter");
//		}else {
//			System.out.println("Element is not enabled or dispalyed ");
//		}
		WebElement password=driver.findElement(By.id("pass"));
		custom_Sendkeys(password,"Test123");
		
		
       // 
		//driver.findElement(By.id("u_0_5_l3")).click();
		// NO Such ElementException 
		
		// Locator - XPath 
		
		WebElement loginButton=driver.findElement(By.name("login"));
		custom_Click(loginButton);
	}

	
	public static void custom_Sendkeys(WebElement element ,String Value) {
		
		if(element.isDisplayed() && element.isEnabled()) {
			element.sendKeys(Value);
		}else {
			System.out.println("Element is not Displayed or Enabled");
		}
	}
	
    public static void custom_Click(WebElement element ) {
		
		if(element.isDisplayed() && element.isEnabled()) {
			element.click();
		}else {
			System.out.println("Element is not Displayed or Enabled");
		}
	}
}
