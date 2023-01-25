package booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelection {
	
	static WebDriver driver;

	public static WebDriver usingChrome()
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	return driver;
	} 

	
	
}
