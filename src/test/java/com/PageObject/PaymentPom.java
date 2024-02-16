package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPom {
	
	WebDriver driver;
	
	@FindBy(xpath="XPath expression")
	WebElement element;
	
	public PaymentPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendValueToelement(String value) {
		element.sendKeys(value);
	}
	

}
