package ui;

import org.testng.annotations.Test;

public class DemoProvider2{

 	@Test(dataProvider="login", dataProviderClass =DemoProvider.class)
	public void test(String username, String password)
	{
		System.out.println(username+".."+ password);
	}
	
	@Test(dataProvider="dataset1", dataProviderClass=DataProvidTest.class )
	public void test1(String username, String password, String test)
	{
		System.out.println(username+"==="+ password+"==="+ test);
	}
	
 }