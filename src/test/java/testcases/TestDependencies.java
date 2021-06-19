package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependencies extends BaseTest{
	
	@Test(priority=1, groups={"functional","smoke"})

	public void doUserReg() {
		System.out.println("Executing User Reg test ");
		//method to fail test case 
		Assert.fail(" User not registered successfully");				
	}
			
	//using dependent method
	@Test(priority=2, dependsOnMethods="doUserReg", groups={"functional","smoke"})
	public void doLogin() {
		System.out.println("Executing login test");
	}
		
	//always run method to run , even the test case dependency failed or not
	@Test(priority=3, dependsOnMethods="doUserReg",alwaysRun=true,groups={"functional","smoke"} )
	public void thirdTest() {
		System.out.println("Executing third Test");
	}
		
	//@Test(priority=4, dependsOnMethods="doUserReg" )
	//using groups method, BVT:- Build verification test
	@Test(priority=4, groups="bvt")
	public void fourthTest() {
		System.out.println("Executing fourth Test");
	}
}
