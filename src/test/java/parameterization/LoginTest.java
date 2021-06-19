package parameterization;

import org.testng.annotations.Test;

public class LoginTest {
	
	//Handling multiple data providers with same names and different arguments. 
	@Test(dataProviderClass=DataProviders.class, dataProvider="dp1")
	public void testLogin(String username,String password) {
		
		System.out.println(username+"----"+password);
	}
	
	@Test(dataProviderClass=DataProviders.class, dataProvider="dp1")
	public void testUserReg(String fname,String lName, String email) 
	{
		
		System.out.println(fname+"----"+lName+"-----"+email);
	}

}
