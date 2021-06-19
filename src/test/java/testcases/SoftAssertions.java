package testcases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	public void validateTitles() {
		
		String expected_title = "Yahoo.com"; // from excel
		String actual_title = "Gmail.com"; //from selenium
		
		SoftAssert softAssert = new SoftAssert();
		
		//failure method 1
		System.out.println("validating title");
		softAssert.assertEquals(actual_title, expected_title);
		
		// soft assertion failure method 2
		System.out.println("validating image");	
		softAssert.assertEquals(true, false,"image not present");
		
		// soft assertion failure method 3
		System.out.println("validating textbox presence");
		softAssert.assertEquals(true, false,"text box not present");
		
		
		//method to execute everything after reporting the failures.
		softAssert.assertAll();
	}

}


