package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@BeforeTest
	public void applicationlogin()
	{
		System.out.println("BeforeTest ");

	}
	
	
	@AfterTest 
	public void applicationlogout()
	{
		System.out.println("AfterTest  ");

	}
	
	@BeforeMethod
	public void connectedbd()
	{
		System.out.println("    BeforeMethod ");

	}
	
	@AfterMethod
	public void disconnectedbd()
	{
		System.out.println("     AfterMethod");

	}
	
	@Test(priority=1,description="test loginnnn")
	public void loginTest()
	{
		System.out.println("    Test 1 : login successful");
	}

	@Test(priority=2,description="test logoutttt")
	public void loginOut()
	{
		System.out.println(" Test 2 :   logout successful");

	}
}
