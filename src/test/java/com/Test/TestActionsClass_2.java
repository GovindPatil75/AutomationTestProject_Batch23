package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActionsClass_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Actions --right click and double click
		
		Actions act=new Actions(driver);
		
		//right click
		
		WebElement Element_RC=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement Quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		//Right click + quit click 
		//act.contextClick(Element_RC).click(Quit).build().perform();
		
		
		//double click
		WebElement doubleclickElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleclickElement).build().perform();
	}

}
