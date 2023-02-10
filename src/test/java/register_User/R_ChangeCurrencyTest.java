package register_User;

 
import org.testng.Assert;
import org.testng.annotations.Test;

import regiter_Utile.R_HomePage;
import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;

public class R_ChangeCurrencyTest extends R_TestBase {
	
	R_HomePage homepage;
	R_SearchPage searchpage;
	R_SearchDetailProduct detailprod;
	
	
	String productName="Apple MacBook Pro 13-inch";
	String suggestpro="Mac";
	

	@Test(priority=1)
	public void changecurrency()
	{
	
		homepage= new R_HomePage(driver);
		homepage.chnagecurrencyId();
	}
	
	@Test(priority=2)
 	public void UserCanSearchWithAutoSuggest()
	{
		searchpage =new R_SearchPage(driver);
		detailprod= new R_SearchDetailProduct(driver);
		
		try
		{
		searchpage.searchproductwithsuggest(suggestpro);
		Assert.assertEquals(detailprod.productNamebread.getText(), productName);
		Assert.assertTrue(detailprod.productPricelbl.getText().contains("€"));
	} catch (Exception e) {
		System.out.println("Error Occurred "+e.getMessage());
	}
	}

}
