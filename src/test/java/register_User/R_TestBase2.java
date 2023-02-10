package register_User;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class R_TestBase2 {

	public static String BaseURL = "https://demo.nopcommerce.com";
	// public static String
	// sauceURL1="https://ahelshal2020:1fa5fca6-4f38-4241-9f21-1ab8e96314ae@ondemand.saucelabs.com:443/wd/hub";

	public static  ThreadLocal<RemoteWebDriver> driver = null;

	@BeforeClass
	@Parameters(value = { "browser" })

	public void setUp(@Optional("chrome") String browser) throws MalformedURLException {
		driver = new ThreadLocal<>();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browser);
		driver.set(new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), caps));

		getDriver().navigate().to(BaseURL);
		
		
		
	}

	public WebDriver getDriver() {
		return driver.get();
	}

	@AfterClass
	public void stopDriver() {
		getDriver().quit();
		driver.remove();
	}

	// take screenshot when test case fail and add it in the screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("failed");
			System.out.println("taking screenshot");
			R_Helper.captureScreenshot(getDriver(), result.getName());
		}
	}

}
