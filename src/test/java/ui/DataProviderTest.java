package ui;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	 
	public void test(String username, String password)
	{
		System.out.println(username+"==="+ password);
	}
	
   @DataProvider
	public Object[][] dataset()
	{
		
		
		Object[][] datas = new Object[4][2];
		
		//first row
		datas[0][0] ="user0";
		datas[0][1] ="pass0";
		
		//second row
		 datas[1][0] ="user1";
		 datas[1][1] ="pass1";
		
		//thirty row
		 datas[2][0] ="user2";
		 datas[2][1] ="pass2";
		 
		//forty row
		 datas[3][0] ="user3";
		 datas[3][1] ="pass3";
		 
		 return datas;
	}

}
