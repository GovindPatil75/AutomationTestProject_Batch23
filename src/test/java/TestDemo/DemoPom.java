package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoPom {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="Xpath expression")
	private WebElement element;
	
	public DemoPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getelement() {
		return element;
	}

}
