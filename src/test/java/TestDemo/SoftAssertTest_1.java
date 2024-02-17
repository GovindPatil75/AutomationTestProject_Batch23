package TestDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest_1 {
	
	
	@Test
	public void VerifyTest_001() {
		
		System.out.println("Browser Open");
		System.out.println("Email -Test");
		System.out.println("Password -12345678");
		//System.out.println("login Button click");
		
		SoftAssert soft=new SoftAssert();
		
		String expected="ABCrts";
		String actual="pqr";
		
		soft.assertEquals(actual, expected); // fail
		
		System.out.println("Test case ...");
		
		soft.assertAll(); // ommit 
	}

}
