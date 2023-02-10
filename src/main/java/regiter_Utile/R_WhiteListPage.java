package regiter_Utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class R_WhiteListPage extends R_BasePage{

	
	public R_WhiteListPage(WebDriver driver) {
		super(driver);
 	}


	@FindBy(css="td.product") public WebElement nameprod;
	@FindBy(css="button.button-2.update-wishlist-button") WebElement updateWhite;
	@FindBy(tagName="h1") public  WebElement wishListHeader;
	@FindBy(css="button.remove-btn") WebElement removebtn; 
	@FindBy(css="div.no-data") 	public WebElement EmptyCartLbl;
	
	
	public void removeprod()
	{
		clickbutton(removebtn);
		
	}
	
	
}
