package register_User;

 
 import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import regiter_Utile.R_CompareProduct;
import regiter_Utile.R_SearchDetailProduct;
import regiter_Utile.R_SearchPage;

public class R_AddProductComapre extends R_TestBase {

	R_SearchPage searchpage;
	R_SearchDetailProduct detailproduct;
    R_CompareProduct comparedeuxprod;

	String firstsuggestproduct = "Mac";
	String seondsuggestproduct = "Asus";
	String firstproduct = "Apple MacBook Pro 13-inch";
	String seondproduct = "Asus N551JK-XO076H Laptop";

	
	@Test 
	public void userAddProductCompare() throws InterruptedException {
		searchpage = new R_SearchPage(driver);
		detailproduct = new R_SearchDetailProduct(driver);
		comparedeuxprod =new R_CompareProduct(driver);

		searchpage.searchproductwithsuggest(firstsuggestproduct);
		assertEquals(detailproduct.productNamebread.getText(), firstproduct);
		detailproduct.AddProductToCompare();

		searchpage.searchproductwithsuggest(seondsuggestproduct);
		assertEquals(detailproduct.productNamebread.getText(), seondproduct);
		detailproduct.AddProductToCompare();

		Thread.sleep(2000);
		driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
		
		assertEquals(comparedeuxprod.firstprod.getText(), firstproduct);
		assertEquals(comparedeuxprod.secondprod.getText(),seondproduct);
		
 		comparedeuxprod.compareProducts();
		

	}
}
