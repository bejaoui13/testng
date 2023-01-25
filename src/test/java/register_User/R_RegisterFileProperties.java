package register_User;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import regiter_Utile.R_HomePage;
import regiter_Utile.R_LoadProperties;
import regiter_Utile.R_LoginPage;

public class R_RegisterFileProperties extends R_TestBase {
 
	
	R_HomePage homepage;
	R_UserRegisterPgae registerproperties;
	R_LoginPage loginuser;
	
	
	R_LoadProperties loaddata = new R_LoadProperties();
	String fname = R_LoadProperties.userdata.getProperty("firstname");
	String lname = R_LoadProperties.userdata.getProperty("lastname");
	String jour = R_LoadProperties.userdata.getProperty("day");
	String mois = R_LoadProperties.userdata.getProperty("month");
	String annee = R_LoadProperties.userdata.getProperty("year");
	String email = R_LoadProperties.userdata.getProperty("email");
	String company = R_LoadProperties.userdata.getProperty("company");
	String pass = R_LoadProperties.userdata.getProperty("password");
	String confpass = R_LoadProperties.userdata.getProperty("confpassword");

	@Test
	public void resgisteruserFileProperties()

	{
		homepage = new R_HomePage(driver);
		homepage.openRegsiterpage();
		registerproperties = new R_UserRegisterPgae(driver);
		registerproperties.userRegister(fname, lname, jour, mois, annee,email, company, pass, confpass);
		assertTrue(registerproperties.successMessage.getText().contains("Your registration completed"));
		
		
		
	}
	
	
	@Test(dependsOnMethods= {"resgisteruserFileProperties"})
	public void userloginproperties()
	{
		homepage.loginPage();
		loginuser= new R_LoginPage(driver);
		loginuser.authentification(email, pass);
		assertTrue(registerproperties.logoutlink.getText().contains("Log out"));
 
	}
	
	@Test(dependsOnMethods= {"userloginproperties"})
	public void userlogoutproperties()
	{
		
		registerproperties.userlogout();
	}

}
