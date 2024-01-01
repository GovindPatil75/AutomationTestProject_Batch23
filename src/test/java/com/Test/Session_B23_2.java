package com.Test;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_B23_2 {

	public static void main(String[] args) throws Exception {
		
		// Browser Driver class exeutable setup 
		WebDriverManager.chromedriver().setup();
		
		// Object Create Browser driver class
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		// Window Maximize
		driver.manage().window().maximize();
		Thread.sleep(3000); // 3 sec
		driver.close(); // Current Window Close 

		
		//Edge
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		
		driver1.quit(); // Current window + All window =Close 
		
	}

}
