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
	
	@Test(priority=2, groups="regression")
	public void aTest1()
	{
		System.out.println(" aTest1 ");
	}

	
	@Test(priority=2, groups="regression")
	public void aTest2()
	{
	
		System.out.println(" aTest2 ");
	}
		
	@Test(priority=1, groups="vbt")
	public void bTest2()
	{
		System.out.println("bTest2");

	}
	
	
	@Test(priority=1, groups="vbt")
	public void bTest3()
	{
		System.out.println("bTest3");

	}
}
