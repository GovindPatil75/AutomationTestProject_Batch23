package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_XPathAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// WebElement -identify -- XPath by Attribute
		//tagname[@attributename='attribute value']
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
