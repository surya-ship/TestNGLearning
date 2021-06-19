package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest{
	
	//invocation count opens same browser and quit 5 times.
	//threadPoolSize opens 5 different browsers.
	@Test(invocationCount=5,threadPoolSize=5)
	public void executeTest() {
         
		driver=getDriver("chrome");
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
