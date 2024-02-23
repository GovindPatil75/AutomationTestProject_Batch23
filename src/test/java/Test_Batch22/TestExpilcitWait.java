package Test_Batch22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExpilcitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		//
		driver.findElement(By.xpath("//button[text()='Enable button after 10 seconds']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Button']"))));
			
		WebElement Button=driver.findElement(By.xpath("//button[text()='Button']"));
			
		System.out.println(Button.isEnabled());
		
		if(Button.isEnabled()) {
			System.out.println("Test case pass -Button is enabled");
		}else {
			System.out.println("Button is disabled ");
		}

	}

}
