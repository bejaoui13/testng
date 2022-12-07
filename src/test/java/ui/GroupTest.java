package ui;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GroupTest {

	@BeforeTest
	public void applicationlogin()
	{
		System.out.println("before to login ");

	}
	
	
	@AfterTest 
	public void applicationlogout()
	{
		System.out.println("logout from appl ");

	}
	
	@BeforeMethod
	public void connectedbd()
	{
		System.out.println("connected  to bd ");

	}
	
	@AfterMethod
	public void disconnectedbd()
	{
		System.out.println("disconnectedbd to bd ");

	}
	
	@Test(priority=1, groups="regression")
	public void aTest()
	{
		System.out.println(" aTest ");
	}

	
	@Test(priority=2, groups="regression")
	public void bTest()
	{
	
		System.out.println(" bTest ");
	}
		
	@Test(priority=3, groups="vbt")
	public void cTest()
	{
		System.out.println("cTest");

	}
	
	
	@Test(priority=4, groups="vbt")
	public void dTest()
	{
		System.out.println("dTest");

	}
}
