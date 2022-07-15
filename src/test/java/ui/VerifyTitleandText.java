package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandText {

	@Test
	public void testTitle()
	{
		String exceptedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle =driver.getTitle();
		
		assertEquals(actualtitle, exceptedtitle);
		driver.close();
	}
}
