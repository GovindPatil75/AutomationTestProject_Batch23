package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelTestDataNumeric {

	public static void main(String[] args) throws Exception {
		
		/*
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		double data=wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();

		System.out.println(data);
		
		String Data1=String.valueOf(data).replace(".", "").replace("E8", "");
		
		System.out.println(Data1); //1.23456789E8
		
		*/
		String Url=Library.getConfigData().getProperty("BaseUrlQA1");
		
		System.out.println(Url);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Library.getTestDataExcel("Sheet1", 0, 2));

		
		
	}

}
