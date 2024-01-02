package com.Test;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_B23_3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Navigation 
	
		driver.navigate().to("https://mvnrepository.com/");
		
		Thread.sleep(3000); // 3 sec
		
		driver.navigate().back();
		
		Thread.sleep(3000); // 3 sec
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		

	}

}
