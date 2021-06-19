package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {

	@Test(groups ="smoke")
	public void validateTitles(int True) {
		System.out.println("Beginning");
		String  expected_title  = "Yahoo.com"; // from excel
		String actual_title = "Gamil.com"; //from selenium
		
		
		//using Assert String method to report the failures of test cases
		//Assert.assertEquals(actual_title, expected_title);
		
		//2).Alternate method , using assertion with boolean condition 
		//utility:-isElementPresent("xpath") - True , if not True-  from selenium		
		Assert.assertTrue(false, "Element not found");
		
		//3) forcefully failing a test case
		//Assert.fail("Failing the test as the condition is not met");
		
	}

	
}
