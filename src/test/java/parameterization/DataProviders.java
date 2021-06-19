package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataProviders {
	
	
	
	@DataProvider(name="dp1")
	//using overloaded Method, to work with single data provider names
	public static Object[][] getData(Method m){
		
		
		Object[][] data = null;
		if(m.getName().equals("testLogin")) {
		
		data = new Object[2][2];
		data[0][0] = "raman";
		data[0][1] = "sdlsldl";
		
		data[1][0] = "Rahul";
		data[1][1] = "ajakakk";
		
		}else if(m.getName().equals("testUserReg")) 
		
		{

            data = new Object[2][3];
			data[0][0] = "raman";
			data[0][1] = "ahuja";
			data[0][2] = "sdl@gmail.com";
			
			data[1][0] = "Rahul";
			data[1][1] = "anjan";
			data[1][2] = "redo@gmail.com";
			
			
		}
		return data;	
	}
	//dp2 is used to run data providers with different names.
  @DataProvider(name="dp2")
	public static Object[][] getData2(){
		
		
		Object[][] data = null;
		
		
		data = new Object[2][2];
		data[0][0] = "raman";
		data[0][1] = "sdlsldl";
		
		data[1][0] = "Rahul";
		data[1][1] = "ajakakk";
		return data;
	}
	
}
