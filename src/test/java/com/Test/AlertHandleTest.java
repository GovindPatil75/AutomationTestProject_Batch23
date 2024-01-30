package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// Alert Handle 
		// private class RemoteAlert implements Alert 
		
		Alert alt=driver.switchTo().alert();
		
		String textonAlert=alt.getText();
		System.out.println(textonAlert);
		
		alt.accept(); // ok button click
		
		//alt.dismiss(); // cancel button click
		
		Thread.sleep(3000);
		
		String text=alt.getText();
		System.out.println(text);
		
		alt.accept();  // Alert Ok button 
		
		//alt.sendKeys("test");

	}

}
