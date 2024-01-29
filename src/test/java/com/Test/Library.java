package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Library {

	
	public static void Screenshot_fullPage(ChromeDriver driver) throws Exception {
		
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir");
		SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd HH::mm:ss");
		Date date=new Date();
		String CurrentDate=formater.format(date);
		String CDate=CurrentDate.replace("/","_").replace(" ", "_").replace(":", "_");
		File Destn=new File(path+"\\"+CDate+".png");
		FileUtils.copyFile(src, Destn);
		
	}
	
	public static void scrollToElement(ChromeDriver driver,WebElement element) {
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
			
	}
	
	public static void dragDropActions(ChromeDriver driver,WebElement src,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
		
	}
	
	
	public static String getTestDataExcel(String sheetname,int row ,int cell) throws Exception {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
	}
	
	public static Properties getConfigData() throws Exception {
		
		  String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch23\\TestData\\Config.Properties";
		  FileInputStream file=new FileInputStream(path);
		  Properties pro=new Properties();
		  pro.load(file);
		  return pro;
	
		}
	
	
}
