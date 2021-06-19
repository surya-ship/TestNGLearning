package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersFromXML {
	
	//to read the parameter from xml we use @Parameters and its value browser
	@Parameters({"browser","env"})
	@Test()
	public void getBrowser(String browser,String env) {
		
		System.out.println(browser+"---"+env);
		
	}

}
