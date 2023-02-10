package regiter_Utile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class R_SearchPage extends R_BasePage{

	public R_SearchPage(WebDriver driver) {
		super(driver);
 	}
	
	@FindBy(id="small-searchterms") WebElement textsearch;
	@FindBy(css="button.button-1.search-box-button") WebElement searchBtn;
	@FindBy(id="ui-id-1") List<WebElement> ProductList;
	@FindBy(linkText="Apple MacBook Pro 13-inch") WebElement productTitle;
	
	public void productSearch(String productName)
	{
		
		sendtext(textsearch, productName);
		clickbutton(searchBtn);
	}
	
	public void openproductdetail()
	{
		clickbutton(productTitle);
	}
	
	public void searchproductwithsuggest(String searchtxt)
	{
		sendtext(textsearch, searchtxt);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ProductList.get(0).click();
	}
}
