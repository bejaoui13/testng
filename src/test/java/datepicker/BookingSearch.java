package datepicker;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class BookingSearch extends LunchBrowser {
	

	@Test
	public void bookingsearchdate() throws InterruptedException
	{
		String month_arrive = "mars 2023";
		String day_arrive = "22";
		
		
		
		driver.findElement(By.xpath("//*[@id=\"arrDate\"]")).click();

		Thread.sleep(2000);

		while (true) {
			String date = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			//System.out.println(date);

			if (date.equals(month_arrive)) {
				break;
			} else {
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
			}

		}

		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td[contains(text(),"
		// + day + ")]")).click();

		// driver.findElement(By.xpath("//*[@id=\"arrDate\"]")).click();

		List<WebElement> allDate = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td"));
		for (WebElement ele : allDate) {
			String date_arrive = ele.getText();
			if (date_arrive.equals(day_arrive)) {
				ele.click();
				break;
			}
			
		}
		
		String checkin = driver.findElement(By.xpath("//input[@id='arrDate']")).getAttribute("value");
		System.out.println(checkin); 
  	}
	
	
   @Test
	public void bookingsearchdatedepart() throws InterruptedException
	{
			
		String month_depart = "mars 2023";
		String day_depart  = "26";
		
			driver.findElement(By.xpath("//*[@id=\"depDate\"]")).click();

		Thread.sleep(2000);

		while (true) {
			String date = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			//System.out.println(date);

			if (date.equals(month_depart)) {
				break;
			} else {
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
			}

		}

		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td[contains(text(),"
		// + day + ")]")).click();

		// driver.findElement(By.xpath("//*[@id=\"arrDate\"]")).click();

		List<WebElement> allDates = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td"));
		for (WebElement eles : allDates) {
			String date_arrive = eles.getText();
			if (date_arrive.equals(day_depart)) {
				eles.click();
				break;
			}
			
		}
		
		String checkout = driver.findElement(By.xpath("//*[@id=\"depDate\"]")).getAttribute("value");
		System.out.println(checkout); 
  	}
 
	
	 
}
