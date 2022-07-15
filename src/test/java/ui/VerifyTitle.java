package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	@Test
	public void testTitle() throws InterruptedException
	{
		SoftAssert softassert = new SoftAssert();
		String exceptedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exceptedText = "Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle =driver.getTitle();
		System.out.println("verification title");
		softassert.assertEquals(actualtitle, exceptedtitle,"title verification faild");


		WebElement actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		String actualtextvalue = actualtext.getAttribute("value");
		System.out.println("verification text");
		softassert.assertEquals(actualtextvalue, exceptedText, "text verification faild");
		System.out.println("close browser");
        driver.close();
		softassert.assertAll();
	}
}
