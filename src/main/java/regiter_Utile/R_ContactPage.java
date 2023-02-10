package regiter_Utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class R_ContactPage extends R_BasePage{
	



	@FindBy(css="div.page-title") WebElement titlepage;
	@FindBy(css="input.fullname") WebElement fullname;
	@FindBy(css="input.email") WebElement email;
	@FindBy(css="textarea.enquiry") WebElement enquiry;
	@FindBy(css="button.button-1.contact-us-button")  WebElement btncontact;

	@FindBy(css="div.result") public WebElement  msgsuccess;
	
	public R_ContactPage(WebDriver driver) {
		super(driver);
	}
	
	public void sendTextrea(String fname, String emailadress, String enguirytext)
	{
		sendtext(fullname, fname);
		sendtext(email, emailadress);
		sendtext(enquiry, enguirytext);
		clickbutton(btncontact);
	}

}
