package datepicker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {

 

		public static WebDriver driver;
		
		@BeforeTest
		public void launchbrowser()
		
		{
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		
			driver.get("https://www.ebooking.tn/");
			driver.manage().window().maximize();
		}
	

}


