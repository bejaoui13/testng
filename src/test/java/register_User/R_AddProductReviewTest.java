package register_User;

import org.testng.Assert;
import org.testng.annotations.Test;

import regiter_Utile.R_HomePage;
import regiter_Utile.R_LoadProperties;
import regiter_Utile.R_LoginPage;
import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;

public class R_AddProductReviewTest extends R_TestBase {

	R_HomePage homepage;
	R_UserRegisterPgae registerpage;
	R_SearchPage searchpage;
	R_LoginPage loginpage;
	R_SearchDetailProduct detailproduct;
	R_ProductReviewPage reviewproduct;

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

	String productName = "Apple MacBook Pro 13-inch";
	String titlereview = "Apple MacBook";
	String textreview = "Apple MacBook Apple MacBook Apple MacBook Apple MacBook  ";

	@Test(priority = 1)
	public void UserRegisterSuccessfully() {
		homepage = new R_HomePage(driver);
		homepage.openRegsiterpage();
		registerpage = new R_UserRegisterPgae(driver);
		registerpage.userRegister(fname, lname, jour, mois, annee, email, company, pass, confpass);
		Assert.assertEquals(registerpage.successMessage.getText(), "Your registration completed");
		homepage.loginPage();
		loginpage = new R_LoginPage(driver);
		loginpage.authentification(email, pass);

	}

	@Test(priority = 2)
	public void userSearchProductswithSuggest() {

		try {
			searchpage = new R_SearchPage(driver);
			searchpage.searchproductwithsuggest("Mac");
			detailproduct = new R_SearchDetailProduct(driver);
			Assert.assertEquals(detailproduct.productNamebread.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error Occurred " + e.getMessage());
		}

	}

	@Test(priority = 3)
	public void registeredCanaddReview() {
		detailproduct.openAddReviewPage();
		reviewproduct = new R_ProductReviewPage(driver);
		reviewproduct.addProductReview(titlereview, textreview);
		Assert.assertEquals(reviewproduct.resultreview.getText(), "Product review is successfully added.");

	}

}
