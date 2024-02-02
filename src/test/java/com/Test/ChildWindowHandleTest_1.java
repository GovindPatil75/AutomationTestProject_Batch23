package com.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandleTest_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String ParentwindowId=driver.getWindowHandle(); // Parent window ID
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllID=driver.getWindowHandles(); // Parent +Child Window ID
		
		Iterator<String> IT=AllID.iterator();
		
		while(IT.hasNext()) {
			
			String WINDOWID=IT.next(); //1
			
			if(!ParentwindowId.equals(WINDOWID)) {
				
				driver.switchTo().window(WINDOWID); // child window switch 
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
			}
		}
		
		driver.switchTo().window(ParentwindowId); // parent window 
		//IT --> 1,2
		

	}

}
