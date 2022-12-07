package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoProvider {

	@Test(dataProvider="login")
	public void testDemo( String username, String password)
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       
       driver.findElement(By.name("user-name")).sendKeys(username);
       driver.findElement(By.name("password")).sendKeys(password);
       driver.findElement(By.name("login-button")).click();
      // driver.close();
	}
	
	@DataProvider(name="login")
	public Object[][] dataDemo()
	{
		return new Object[][]
				{
		       	{"standard_user","secret_sauce"},
		       	{"locked_out_user","secret_sauce"},
		       	{"problem_user","secret_sauce"},
		       	{"performance_glitch_user","secret_sauce"},
				};
	}
 }
