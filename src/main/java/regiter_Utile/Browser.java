package regiter_Utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	static WebDriver driver;

	public static WebDriver startBrowser(String BrowserName, String url) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
			new ChromeDriver();
		}

		if (BrowserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "/driver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;

	}

}
