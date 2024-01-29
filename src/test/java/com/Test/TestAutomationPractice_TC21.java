package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomationPractice_TC21 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		WebElement ViewProduct=driver.findElement(By.xpath("//a[@href='/product_details/2']"));
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].scrollIntoView();", ViewProduct);
		
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch23\\TC21.png");
		FileUtils.copyFile(src, destn);
		
		ViewProduct.click();
		
		Thread.sleep(5000);
		
		WebElement Qty=driver.findElement(By.xpath("//input[@name='quantity']"));
		Qty.clear();
		Qty.sendKeys("5");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
	
		String filepath="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch23\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String Name=wb.getSheet("TC_21").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Name);
		String Email=wb.getSheet("TC_21").getRow(0).getCell(1).getStringCellValue();
		System.out.println(Email);
		String Comments=wb.getSheet("TC_21").getRow(0).getCell(2).getStringCellValue();
		System.out.println(Comments);
		
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Name);
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
       driver.findElement(By.xpath("//textarea[@id='review']")).sendKeys(Comments);
       
       driver.findElement(By.xpath("//button[@id='button-review']")).click();
       
      
	}

}
