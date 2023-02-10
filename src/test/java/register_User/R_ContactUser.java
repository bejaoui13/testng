package register_User;

import org.testng.Assert;
import org.testng.annotations.Test;

import regiter_Utile.R_ContactPage;
import regiter_Utile.R_HomePage;

public class R_ContactUser extends R_TestBase {

	R_HomePage homepage;
	R_ContactPage contactuser;
	
	String fname= " hamdiiiii";
	String email= " hamdiiiii@gmail.com";
	String textenguiry= " textenguiry textenguirytextenguirytextenguiry";
	
	@Test 
	public void UsercanuseContactUs()
	{
		  homepage = new R_HomePage(driver);
		  contactuser = new R_ContactPage(driver);
		  
		  homepage.contactLinkpage();
		  contactuser.sendTextrea(fname, email, textenguiry);
		  Assert.assertTrue(contactuser.msgsuccess.getText().contains("successfully"), "Test Good");
		  
	}
}
