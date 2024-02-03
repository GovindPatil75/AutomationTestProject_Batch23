package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// Mainpage --frame1
		
		WebElement Frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(Frame1); //Mainpage --frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");
		
		// frame1 ---Mainpage
		
		driver.switchTo().defaultContent(); //frame1 ---> Mainpage
		
		driver.switchTo().frame(1); // Mianpage --> frame2
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test 1");
		
		// frame2 ---Mainpage
		
		driver.switchTo().defaultContent();  // frame2 ---> Mainpage
		
		//Scenario 2 : Mainpage-- >Frame3 -->inneriframe
		
		driver.switchTo().frame(2); // mianpage -->frame3
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test 2");
		
		WebElement Iframeinner=driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(Iframeinner); // frame 3 -->innerframe
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
		
		//Scenario 3 : Mainpage <-- Frame3 <--inneriframe
		
		driver.switchTo().parentFrame(); //Frame3 <--inneriframe
		driver.switchTo().defaultContent(); //Mainpage <-- Frame3
		
		// Minapage--Frame 4
		
		driver.switchTo().frame(3); // frame 4
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Test4");
		

	}

}
