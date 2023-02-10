package register_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import regiter_Utile.R_BasePage;

public class R_ProductReviewPage extends R_BasePage {

	public R_ProductReviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "AddProductReview_Title")  	WebElement titleProductReview;
	@FindBy(id = "AddProductReview_ReviewText")  	WebElement textProductReview;
	@FindBy(id = "addproductrating_4") 	WebElement goodnote;
	@FindBy(css = "button.button-1.write-product-review-button") 	WebElement submutreview;
	@FindBy(css="div.result") WebElement resultreview;

	public void addProductReview(String titleReview, String textReview) {
		sendtext(titleProductReview, titleReview);
		sendtext(textProductReview, textReview);
		clickbutton(goodnote);
		clickbutton(submutreview);

	}

}
