package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Scroll --pixel ,WebElement
		
		JavascriptExecutor js=driver;
		// Top- bottom pixel
		js.executeScript("window.scrollBy(0,350)", " ");
		
		Thread.sleep(3000); // 3 sec
		
		//bottom-top pixel
		js.executeScript("window.scrollBy(0,-350)", " ");
		
		Thread.sleep(3000); // 3 sec
		
		// arguments[0].scrollIntoView() ,element
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		
		js.executeScript("arguments[0].scrollIntoView();", submit);
		
		
		// Scroll to at bottom 
		
		//document.body.scrollHeight =944
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		

	}

}
