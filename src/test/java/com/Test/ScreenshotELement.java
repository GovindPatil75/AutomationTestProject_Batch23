package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotELement {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		// How to capture Screenshot of WebElement 
		
		WebElement RegisterLogo=driver.findElement(By.xpath("//img[@src='images/mast_register.gif']"));
		File src=RegisterLogo.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File destn=new File(path+"//ScreenShot//RegLogo.png");
		FileUtils.copyFile(src, destn);
		
	}

}
