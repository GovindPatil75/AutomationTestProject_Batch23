package TestDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass_1 {
	 
	public static WebDriver driver;
	public static DemoPom demo;
	public static Library library;
	
	@BeforeSuite
	public void setUp() {
		 demo=new DemoPom(driver);
		 library=new Library();
	}
	
	@BeforeMethod
	public void BrowserLaunch() {
		
		System.out.println("Browser Open");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Browser window close");
	}

}
