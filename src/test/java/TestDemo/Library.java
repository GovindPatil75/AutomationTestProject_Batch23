package TestDemo;

import org.openqa.selenium.WebElement;

public class Library {
	
	
	public void custom_SendKeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
