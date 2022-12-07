package ui;

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
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
 		SoftAssert softassert = new SoftAssert();
		String exceptedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		softassert.assertEquals(actualtitle, exceptedtitle,"title verification faild");  

		
		WebElement actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		String actualtextvalue = actualtext.getAttribute("value");
 		String exceptedText = "Search";
    	softassert.assertEquals(actualtextvalue, exceptedText, "text verification faild");
        driver.close();
		softassert.assertAll();
	}
}
