package regiter_Utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 


public class R_LoginPage extends R_BasePage{
	
	
	@FindBy(css="input.email") WebElement emailbox;
	@FindBy(css="input.password") WebElement passwordbox;
	@FindBy(css="button.button-1.login-button") WebElement boutonlink;
	
 	
	public R_LoginPage(WebDriver driver)
	{
		super(driver);
	}

	public void authentification (String email,String password)
	{
		sendtext(emailbox, email);
		sendtext(passwordbox,password );
		clickbutton(boutonlink);
	}
	
}
