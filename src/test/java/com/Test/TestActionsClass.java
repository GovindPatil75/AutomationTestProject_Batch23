package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActionsClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Actions --mouse movement and keyboard action 
		
		Actions act=new Actions(driver);
		
		//mouse hover + click
		
		WebElement elementFP=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		act.moveToElement(elementFP).click().build().perform();
		
		
		
	}

}
