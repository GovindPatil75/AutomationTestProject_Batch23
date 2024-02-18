package Test_Batch22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement Email;
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail() {
		return Email;
	}
}
