package TestDemo;

import org.testng.annotations.Test;

public class TestDemo extends BaseClass_1{
	
	@Test
	public void test_001() {
		
		library.custom_SendKeys(demo.getelement(), "Test");
		
		
	}

}
