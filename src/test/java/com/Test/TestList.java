package com.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//
		
		List<String >Expected=new ArrayList<String>();
		
		Expected.add(0, "Test1");
		Expected.add(1, "Test2");
		Expected.add(2, "Test3");
		Expected.add(3, "Test1");
		
		List<WebElement> listElement=driver.findElements(By.xpath(""));
		

	}

}
