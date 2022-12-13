package datepicker;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicketDemo1 {

	@Test
	public void search() throws InterruptedException {

		String month = "mars 2023";
		String day = "10";
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebooking.tn/");
		driver.findElement(By.xpath("//*[@id=\"arrDate\"]")).click();

		Thread.sleep(2000);

		String monthtext;

		while (true) 
		{
			monthtext = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			System.out.println(monthtext);

			if (monthtext.equals(month))

			{
				break;
			} else {
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
			}

		}
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
 

		// List <WebElement> allDate =
		// driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		// for(WebElement ele:allDate)
		// { System.out.println(ele.getText()); }
	}
}
