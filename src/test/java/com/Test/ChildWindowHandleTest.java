package com.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//
		
		String ParentWindowID=driver.getWindowHandle(); // Parent window ID
		
		System.out.println(ParentWindowID);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllID=driver.getWindowHandles(); // Parent +Child Window ID
		/*
		Iterator<String> IT=AllID.iterator();
		while(IT.hasNext()) {
			
			String WID=IT.next();
			
			if(!ParentWindowID.equals(WID)) {
				
				driver.switchTo().window(WID);
			}
		}
		*/
		
		System.out.println(AllID);
		
		
		List<String> list=new ArrayList<String>(AllID);
		
		list.get(0); // parent window id 
		String ChildwindowID=list.get(1); // child window id 
		
		System.out.println(ChildwindowID);
		
		driver.switchTo().window(ChildwindowID); // switch Child window 
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
		
		driver.switchTo().window(ParentWindowID); // Parent window Switch
		
		//driver.close();
		//driver.quit();

	}

}
