package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
	
	public void onTestSuccess(ITestResult  result) {
		System.out.println("Passed Test -   "+result.getName());
	}
	
	//if test is failed
	public void onTestFailure(ITestResult result)
	{
		//to see the html output we have to add this statement
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		
		//using reporter method to add the screenshot link in the test report.
		//Reporter.log("<a href=\"E:\\Screenshot\\error.jpg\">Screenshot link</a>");
		
		//opening the link in a new tab, using \"target=\"_blank\
		Reporter.log("<a href=\"E:\\Screenshot\\error.jpg\"target=\"_blank\">Screenshot link</a>");
		//break statement
		Reporter.log("br");
		//adding thumb nail, in braces we have to write html code.
		Reporter.log("<a href=\"E:\\Screenshot\\error.jpg\"target=\"_blank\"><img height=200 width=200 src=\"E:\\Screenshot\\error.jpg\"></a>");
		
		System.out.println("Capturing Screenshot for the Failed test --"+result.getName());
	}

}
