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
		System.out.println(" ** before to login ");

	}
	
	
	@AfterTest 
	public void applicationlogout()
	{
		System.out.println("  ** logout from appl ");

	}
	
	@BeforeMethod
	public void connectedbd()
	{
		System.out.println(" ***** connected  to  bd ");

	}
	
	@AfterMethod
	public void disconnectedbd()
	{
		System.out.println(" *****  disconnectedbd to  bd ");

	}
	
	@Test(priority=2,description="test logout")
	public void loginTest()
	{
		System.out.println(" login successful");
	}

	@Test(priority=1,description="test logout")
	public void loginOut()
	{
		System.out.println(" logout successful");

	}
}
