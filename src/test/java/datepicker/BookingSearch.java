package datepicker;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingSearch {
	
	@Test
	public void bookingsearchdate() throws InterruptedException
	{
		String month = "mars 2023";
		String day = "15";
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.ebooking.tn/");
		driver.manage().window().maximize();

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
  
		driver.findElement(By.xpath("//*[@id=\"arrDate\"]")).click();

		 List <WebElement> allDate = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td")) ;
		  for(WebElement ele:allDate)
	      {
			  System.out.println(ele.getText()); 
				}
		 
 
 	}
}
