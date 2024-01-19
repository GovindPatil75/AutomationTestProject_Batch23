package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//DropDown Handle -- Element --tagname select --Select class 
		
		WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
		Select dropdown=new Select(Country);
		//selectByIndex
		dropdown.selectByIndex(4);
		//selectByValue
		dropdown.selectByValue("ARGENTINA");
		//selectByVisibleText
		dropdown.selectByVisibleText("INDIA");
		
		
		
		//verify DropDown option count 
		List<WebElement> list=dropdown.getOptions();
		int DropDownOptionCount=list.size();
		System.out.println(DropDownOptionCount); //264
		
		
		
		// DropDown option consol print 
		for(int i=0;i<DropDownOptionCount;i++) {
			
			String value=list.get(i).getText();
			System.out.println(value);
			//without using select class 
			if(value.equals("SWEDEN")) {
				list.get(i).click();
				break;
			}
		}
	}
}
