package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1{
	
	//will be called first in this class
	@BeforeTest
	public void creatingDBConn() {
		System.out.println("Creating db conn");
	}
	//will be called at the end of all test cases
	@AfterTest
	public void closeDBConn() {
		System.out.println("Closing db conn");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing the browser");
	}
	
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Executing User Reg test ");
	}
	@Test(priority=2)
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
}
