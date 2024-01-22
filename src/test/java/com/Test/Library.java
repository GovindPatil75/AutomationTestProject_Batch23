package com.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	
	
}
