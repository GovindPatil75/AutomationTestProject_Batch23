package TestDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssert_1 {

	
	@Test
	public void verifyTest_1() {
		
		System.out.println("Browser Open");
		System.out.println("Email -Test");
		System.out.println("Password -12345678");
		System.out.println("login Button click");
		// verify
		
		String Expectedtitle="Xyz";
		
		//driver.gettitle(); --- title --actaultle
		
		String ActualTitle="ABC";
		
		// verify
		Assert.assertEquals(ActualTitle, Expectedtitle);
		
		System.out.println("Test case .....");
		
		Assert.assertTrue(false); // Fail
	}
}
