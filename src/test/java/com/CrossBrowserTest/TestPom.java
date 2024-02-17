package com.CrossBrowserTest;

import org.testng.annotations.Test;

public class TestPom extends BaseClass{
	
	
	@Test
	public void verifyTest1() {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		
		//LoginPom login=new LoginPom(driver);
		//login.getEmail().sendKeys("Test");
		
		login.getEmail().sendKeys("Test");
		login.getPassword().sendKeys("123");
		
		homepage.getelement().sendKeys("Test");
		
		//LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getEmail().sendKeys("Test");
		login.getPassword().sendKeys("12345678");
		login.getLogintBtn().click();
		
		
	}

}
