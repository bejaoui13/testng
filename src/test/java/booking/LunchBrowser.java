package booking;

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
		
			driver.get("https://www.ebooking.tn/hotels?rooms=1&IdHotel=7&IdCity=0&checkIn=22%2F02%2F2023&checkOut=24%2F02%2F2023&valrooms=1&adults1=1&children1=2&age1_1=3&age2_1=3");
			driver.manage().window().maximize();
		}
	

}


