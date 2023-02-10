package register_User;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;

public class R_SearchProductTest extends R_TestBase {
	
	
	String productName = "Apple MacBook Pro 13-inch";
	R_SearchPage searchpage;
	R_SearchDetailProduct searchdetailpage;

	
	
	@Test(priority = 1)
	public void userSearchForProducts() {
		searchpage = new R_SearchPage(driver);
		searchdetailpage = new R_SearchDetailProduct(driver);
		searchpage.productSearch(productName);
		searchpage.openproductdetail();
		assertEquals(searchdetailpage.productNamebread.getText(), productName);
	}
	
	
	@Test(priority = 2)
	public void userSearchProductswithSuggest() {
		
		try
		{
		searchpage=new R_SearchPage(driver);
		searchpage.searchproductwithsuggest("Apple MacBook");
		searchdetailpage=new R_SearchDetailProduct(driver);
		//Assert.assertEquals(searchdetailpage.productNamebread.getText(), productName);
		
	} catch (Exception e) {
		System.out.println("Error Occurred "+e.getMessage());
	}
	

	}

}
