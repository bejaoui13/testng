package regiter_Utile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class R_CompareProduct extends R_BasePage {

	public R_CompareProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "a.clear-list")  	public WebElement clearlist;
	@FindBy(css = "table.compare-products-table")  	public WebElement comparetable;
	@FindBy(tagName = "tr")    	public List<WebElement> allrows;
	@FindBy(tagName = "td")    	public List<WebElement> allcolumn;
	@FindBy(linkText = "Apple MacBook Pro 13-inch")  	public WebElement firstprod;
	@FindBy(linkText = "Asus N551JK-XO076H Laptop")  	public WebElement secondprod;

	public void clearCompareList() {
		clickbutton(clearlist);

	}

	public void compareProducts() {
		System.out.println(allrows.size());

		for (WebElement row : allrows) {
			 System.out.println(row.getText());

			/*for (WebElement column : allcolumn) {
				System.out.println(column.getText());

			} */

		}
	}

}
