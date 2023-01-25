package register_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import regiter_Utile.R_BasePage;

public class R_UserRegisterPgae extends R_BasePage {

	public R_UserRegisterPgae(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-male") 	WebElement gendermale;
	@FindBy(id = "FirstName") 	WebElement firstName;
	@FindBy(id = "LastName") 	WebElement lastName;
	@FindBy(name = "DateOfBirthDay") 	WebElement dateBirthday;
	@FindBy(name = "DateOfBirthMonth") 	WebElement datebirthmonth;
	@FindBy(name = "DateOfBirthYear") 	WebElement datebirthyear;
	@FindBy(id = "Email") 	WebElement email;
	@FindBy(id = "Company") 	WebElement company;
	@FindBy(id = "Newsletter") 	WebElement newsletter;
	@FindBy(id = "Password") 	WebElement password;
	@FindBy(id = "ConfirmPassword") 	WebElement confirmpassword;

	@FindBy(id = "register-button") 	WebElement registerbutton;
	@FindBy(css = "div.result") 	public WebElement successMessage;
	@FindBy(linkText = "Log out") 	public WebElement logoutlink;
	@FindBy(linkText = "My account") 	public WebElement myaccount;

	public void userRegister(String fname, String lname, String day, String mois, String year, String emailbox, String companybox, String passw,String confpassw ) {
		
		clickbutton(gendermale);
		sendtext(firstName, fname);
		sendtext(lastName, lname);
		selectNB(datebirthmonth, mois);
		selectNB(datebirthyear, year);
		selectNB(dateBirthday, day);
		sendtext(email, emailbox);
		sendtext(company, companybox);
		sendtext(password, passw);
		sendtext(confirmpassword, confpassw);
		
	
		clickbutton(registerbutton);

	}
	
	public void userlogout()
	{
		clickbutton(logoutlink);
	}
	
	public void openmyaccount()
	{
		clickbutton(myaccount);
		
	}
}
