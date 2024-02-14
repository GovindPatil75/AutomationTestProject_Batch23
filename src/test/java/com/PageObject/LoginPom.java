package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement logintBtn;

	//genrate getter method -- return WebElemenet 
	
	public WebElement getEmail() {
		return email;
	}

	
	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getLogintBtn() {
		return logintBtn;
	}


	
	
}
