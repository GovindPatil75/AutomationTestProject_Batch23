package Test_Batch22;

import org.testng.annotations.Test;

public class VerifyTest extends BaseClass{

	
	@Test
	public void verifyLoginTest() {
		
		LoginPom login=new LoginPom(driver);
		Library.customSendkeys(login.getEmail(), "Test");
		
	}
}
