package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String text1=Library.handleAlert(driver).getText();
		Library.handleAlert(driver).accept();
		
		String text2=Library.handleAlert(driver).getText();
		Library.handleAlert(driver).accept();
		
		

	}

}
