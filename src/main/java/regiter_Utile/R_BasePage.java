package regiter_Utile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class R_BasePage {

	protected WebDriver driver;
	public JavascriptExecutor jse;
	public Select select;
	public Actions action;

	public R_BasePage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public static void clickbutton(WebElement button) {
		button.click();
	}

	public void scrollToBottom() {
		jse.executeScript("scrollBy(0,2500)");

	}

	public void sendtext(WebElement element, String value) {
		element.sendKeys(value);

	}

	public void clearText(WebElement element) {
		element.clear();
	}

	public void selectNB(WebElement elements, String number) {
		elements.click();
		Select se = new Select(elements);
		se.selectByVisibleText(number);

	}
}
