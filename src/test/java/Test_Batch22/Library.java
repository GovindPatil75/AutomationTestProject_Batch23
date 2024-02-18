package Test_Batch22;

import org.openqa.selenium.WebElement;

public class Library {

	public static void customSendkeys(WebElement element ,String value) {
		try {
			element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void customClick(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
