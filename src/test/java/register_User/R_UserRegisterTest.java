package register_User;

import org.testng.Assert;
import org.testng.annotations.Test;

import regiter_Utile.R_HomePage;
import regiter_Utile.R_LoginPage;

public class R_UserRegisterTest extends R_TestBase {
	R_HomePage homepage;
	R_UserRegisterPgae userregisterpage;
	R_LoginPage userlogin;
	
	public void userRegisterSuccessfully() {

		homepage = new R_HomePage(driver);
		homepage.openRegsiterpage();
		userregisterpage = new R_UserRegisterPgae(driver);
		userregisterpage.userRegister("alidll", "ahdmedgl", "ahdelg2204l@gmail.com", "dbai", "123456ahmedd","123456ahmedd", "2", "April", "2000");
		String msg = userregisterpage.successMessage.getText();
		Assert.assertEquals(msg, "Your registration completed");

	}

 
	@Test(dependsOnMethods= {"login_user"})
	public void logout_user()
	{
		userregisterpage = new R_UserRegisterPgae(driver);
		userregisterpage.userlogout();
		
	}
	
	
	@Test
	public void login_user()
	{
		
		homepage=new R_HomePage(driver);
		homepage.loginPage();
		userlogin = new R_LoginPage(driver);
		userlogin.authentification("ahdelg2204l@gmail.com", "123456ahmedd");
		
	} 
	
}
