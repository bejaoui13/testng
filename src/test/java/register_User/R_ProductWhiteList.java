package register_User;

import org.testng.Assert;
import org.testng.annotations.Test;

 import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;
import regiter_Utile.R_WhiteListPage;



public class R_ProductWhiteList extends R_TestBase {

	String productName = "Apple MacBook Pro 13-inch";
	String suggestproduct = "Mac";

	R_SearchPage searchpage;
	R_SearchDetailProduct detailprod;
	R_WhiteListPage whitelist;

	@Test(priority = 1)
	public void searchProdcutSuggest()

	{

		try {
			searchpage = new R_SearchPage(driver);
			detailprod = new R_SearchDetailProduct(driver);
			

			searchpage.searchproductwithsuggest(suggestproduct);
			searchpage.openproductdetail();
			Assert.assertEquals(detailprod.productNamebread.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error Occurred " + e.getMessage());
		}
	}

	@Test(priority = 2)

	public void addproductWhitelist() throws InterruptedException {
		
		whitelist = new R_WhiteListPage(driver);
	
		
		detailprod.AddProductToWishlist();
		driver.navigate().to("https://demo.nopcommerce.com/wishlist");
		Thread.sleep(2000);
		Assert.assertTrue(whitelist.wishListHeader.isDisplayed());
		Thread.sleep(2000);
		Assert.assertEquals(whitelist.nameprod.getText(), productName);
		System.out.println(whitelist.wishListHeader.getText());
		System.out.println(whitelist.nameprod.getText());
	}
	
	@Test(priority = 3)

	public void UserCanRemoveProductFromCart()
	{
		whitelist.removeprod();
		Assert.assertTrue(whitelist.EmptyCartLbl.getText().contains("empty"));		
	}

}
