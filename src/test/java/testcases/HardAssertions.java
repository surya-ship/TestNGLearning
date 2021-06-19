package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	public void validateTitles() {
		
		String expected_title = "Yahoo.com"; // from excel
		String actual_title = "Gmail.com"; //from selenium
		// hard assertion failure method 1
		System.out.println("validating images");
		Assert.assertEquals(actual_title, expected_title);
		
		// hard assertion failure method 2
		System.out.println("validating image");	
		Assert.assertEquals(true, false);
		
		// hard assertion failure method 3
		System.out.println("validating textbox presence");
		Assert.assertEquals(true, false);
		
		System.out.println("Ending");
	}

}
