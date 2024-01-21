package com.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// Full Page Screenshot 
		
		String path=System.getProperty("user.dir");
		 //C:\Users\Dell\eclipse-workspace\AutomationTestProject_Batch23
		System.out.println(path);
		
		SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		String currentDate=formater.format(date);
		
		System.out.println(currentDate);
		
		String CDate=currentDate.replace("/", "_").replace(" ","_").replace(":", "_");
		
		System.out.println(CDate);
		
		String RM=RandomString.make(3); //ABC12 // rts13 //pqr
		
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+CDate+".png");
		FileUtils.copyFile(src, destn);

	}

}
