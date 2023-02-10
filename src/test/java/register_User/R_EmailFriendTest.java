package register_User;

 import org.testng.Assert;
import org.testng.annotations.Test;

import regiter_Utile.R_HomePage;
import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;

public class R_EmailFriendTest extends R_TestBase{

	R_HomePage homepage;
	R_UserRegisterPgae registeruser;
	R_SearchProductTest searchprod ;
	
	String name = "ddddd";
	String lname = "ddddd";
	String day = "5";
	String mois = "April";
	String year = "2000";
	String emailbox = "ddddd@gmail.com";
	String companybox = "dubai";
	String passw = "ssdssss2";
	String confpassw = "ssdssss2";
	
	String suggest = "ddddd";
	
	
	@Test
	public void usercanRegister()
	{
		
		homepage= new R_HomePage(driver);
		registeruser= new R_UserRegisterPgae(driver);

 
		homepage.openRegsiterpage();
		registeruser.userRegister(name, lname, day, mois, year, emailbox, companybox, passw, confpassw);
		Assert.assertEquals(registeruser.successMessage.getText(), "Your registration completed");

		
	}
	
	public void searchsuggestproduct()
	{
		searchprod = new R_SearchProductTest();
		searchprod.;
	}
	

  
 
	
}
