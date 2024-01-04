package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login_01_VerifyLoginPageFunctionality {

	public static void main(String[] args) {
		
		// Step 1
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//we need to identify WebElement -- Locator -- name 
		
		// Step 2
		WebElement Emailid=driver.findElement(By.name("email"));
		Emailid.sendKeys("Test123@gmail.com");
		
        // Step 3
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("123abc");
		
		// Step 4
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		
		// Step 5 - Verify
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle="FaceBOOK HomePage ";
		
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case Fail");
		}
		
		
	}

}
