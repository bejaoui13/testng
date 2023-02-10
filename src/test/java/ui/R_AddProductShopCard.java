package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import register_User.R_TestBase;
import regiter_Utile.R_BasePage;
import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;
import regiter_Utile.R_ShoppingCartPage;

public class R_AddProductShopCard extends R_TestBase {

	String productName = "Apple MacBook Pro 13-inch";
	String suggestproduct = "Mac";
	String qte="3";
	String priceexpected ="$5,400.00";
	
	R_SearchPage searchpage;
	R_SearchDetailProduct detailProd;
	R_ShoppingCartPage cartshop;
	
	 
	
	@Test(priority=1)
	public void searchwithsuggest()
	
	{
		try
		{
		searchpage = new R_SearchPage(driver);
		detailProd = new R_SearchDetailProduct(driver); 
		
		searchpage.searchproductwithsuggest(suggestproduct);
		Assert.assertEquals(detailProd.productNamebread.getText(), productName);
		
		} catch (Exception e) {
			System.out.println("Error Occurred "+e.getMessage());
		}
		
				
 	}
	
	@Test(priority=2)
	public void userAddPriductCard() throws InterruptedException
	{
		detailProd.addToCart();
		Thread.sleep(2000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");

 	}
	
	@Test(priority=3)
	public void addQunatity()  
	{
		try {
			Thread.sleep(2000);

			cartshop = new R_ShoppingCartPage(driver);
			cartshop.UpdateProductQuantityInCart(qte);
			Thread.sleep(2000);

	        Assert.assertEquals(cartshop.totalPrice.getText(), priceexpected );
			System.out.println(cartshop.totalPrice.getText());
		} catch (InterruptedException e) {
 			e.printStackTrace();
		}

 		
	}
	
	@Test(priority=4)
 	public void UserCanRemoveProductFromCart() throws InterruptedException
	{
	 
		cartshop.supprimerProduct();
		Thread.sleep(2000);
		assertEquals(cartshop.emptyCart.getText(), "Your Shopping Cart is empty!");
		Thread.sleep(2000);

		}
	

	 
}
