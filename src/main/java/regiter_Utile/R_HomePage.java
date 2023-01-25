package regiter_Utile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class R_HomePage extends R_BasePage {

	WebDriver driver;

	public R_HomePage(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor) driver;
		action=new Actions(driver);

	}

	@FindBy(linkText = "Register") 	   WebElement RegiterLink;
	@FindBy(linkText = "Log in")     	WebElement LoginLink;
	@FindBy(linkText = "Contact us") 	WebElement ContactLink;
	@FindBy(id = "customerCurrency") 	WebElement Currencyid;
	@FindBy(linkText = "Computers") 	WebElement ComputerLink;
	@FindBy(linkText = "Notebooks") 	WebElement NotebooksLink;

	public void openRegsiterpage() {
		clickbutton(RegiterLink);
	}

	public void loginPage() {
		clickbutton(LoginLink);
	}

	public void contactLinkpage() {
		scrollToBottom();
		clickbutton(ContactLink);
	}

	public void currencyId() {
		select = new Select(Currencyid);
		select.deselectByVisibleText("Euro");
	}

	public void computerLinkPage() {

		action.moveToElement(ComputerLink).click().build().perform();
	}

	public void notebooksLinkPage() {
		action.moveToElement(NotebooksLink).click().build().perform();


	}

}
