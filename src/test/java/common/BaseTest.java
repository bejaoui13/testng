package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void launchbrowser()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
}
