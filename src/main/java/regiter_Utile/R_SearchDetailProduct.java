package regiter_Utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class R_SearchDetailProduct extends R_BasePage{

	
	
	public R_SearchDetailProduct(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="strong.current-item") public WebElement productNamebread;
	@FindBy(css="button.button-2.email-a-friend-button") WebElement emailFriendBtn;
	@FindBy(css="span.price-value-4") 	public WebElement productPricelbl;
	@FindBy(linkText="Add your review") 	WebElement addReviewLink;
	@FindBy(id="add-to-wishlist-button-4") 	WebElement addToWishListBtn;
	@FindBy(css="button.button-2.add-to-compare-list-button") 	WebElement addToCompareBtn;
	@FindBy(id="add-to-cart-button-4") 	WebElement addToCartBtn;
	
	
 	
	public void opensendemail()
	{
		clickbutton(emailFriendBtn);
	}
	
	public void openAddReviewPage()
	{
		clickbutton(addReviewLink);
	}

	public void AddProductToWishlist()
	{
		clickbutton(addToWishListBtn);
	}
	
	
	public void AddProductToCompare()
	{
		clickbutton(addToCompareBtn);
	}

	public void addToCart()
	{
		clickbutton(addToCartBtn);

	}
}
