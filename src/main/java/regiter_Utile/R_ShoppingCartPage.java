package regiter_Utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class R_ShoppingCartPage extends R_BasePage{

	
	public R_ShoppingCartPage(WebDriver driver) {
		super(driver);
 	}
	
	
	@FindBy(css="input.qty-input") WebElement qteProduct;
	@FindBy(css="span.product-subtotal") public WebElement totalPrice;
	@FindBy(name="updatecart") WebElement removeProduct;
	@FindBy(css="button.button-2.update-cart-button") public WebElement updateCart;
	@FindBy(css="button.button-1.checkout-button") WebElement checkout;
	@FindBy(css="div.no-data") public WebElement emptyCart;
	@FindBy(id="termsofservice") WebElement agreeterms; 
	
	
	public void UpdateProductQuantityInCart(String qte)
	{
		clearText(qteProduct);
        sendtext(qteProduct, qte);
        clickbutton(updateCart);
    }
	
	public void openCheckoutPage()
	{
		clickbutton(agreeterms);
		 clickbutton(checkout);
	}
	
	public void supprimerProduct()
	{
		clickbutton(removeProduct);
 	}
}
