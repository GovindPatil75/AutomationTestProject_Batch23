package com.Test;

import java.io.File;
import java.io.IOException;

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
		System.out.println(path);
		
		String RM=RandomString.make(5);
		
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+RM+".png");
		FileUtils.copyFile(src, destn);

	}

}
