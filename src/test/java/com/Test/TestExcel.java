package com.Test;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch23\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		String data1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		
		// Browser Open
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Element --Test data
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(data1);
		
	}

}
