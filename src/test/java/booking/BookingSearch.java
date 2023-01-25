package booking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookingSearch extends LunchBrowser {

	@Test(priority = 1)
	public void Hammamet() throws InterruptedException {
		String ville = "Hammamet";
		String hotel = "Blue Marine Hotel & Thalasso Hammamet";
		driver.findElement(By.xpath(" //*[@id=\"HotelOrCityName\"]")).sendKeys(ville);
		Thread.sleep(3000);

		List<WebElement> allville = driver.findElements(By.cssSelector(".ui-menu-item"));
		for (WebElement vil : allville) {
			String hotel_list = vil.getText();

			if (hotel_list.equals(hotel)) {
				vil.click();
				System.out.println(hotel_list);

				break;
			}

		}
		String villede = driver.findElement(By.xpath("//*[@id=\"HotelOrCityName\"]")).getAttribute("value");
		System.out.println(villede);
	}

	@Test(priority = 2)
	public void bookingsearchdate() throws InterruptedException {
		String month_arrive = "février 2023";
		String day_arrive = "22";

		driver.findElement(By.xpath("//*[@id=\"arrDate\"]")).click();

		Thread.sleep(2000);

		while (true) {
			String date = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			// System.out.println(date);

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

	@Test(priority = 3)
	public void bookingsearchdatedepart() throws InterruptedException {

		String month_depart = "février 2023";
		String day_depart = "24";

		driver.findElement(By.xpath("//*[@id=\"depDate\"]")).click();

		Thread.sleep(2000);

		while (true) {
			String date = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			// System.out.println(date);

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

	
	@Test(priority = 4)
	public void ageEnfant() throws InterruptedException 

		{
			String nbpax = "1";
			String nbenfant = "2";
			String age_oneenf = "3";

			driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div/div[4]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"adults_1\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"adults_1\"]")).sendKeys(nbpax);
			driver.findElement(By.xpath("//*[@id=\"children_1\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"children_1\"]")).sendKeys(nbenfant);

			Thread.sleep(1000);

			for (int i=1; i<= Integer.parseInt(nbenfant) ; i++)
			{
			
			driver.findElement(By.xpath("//*[@id=\"age_"+i+"_1\"]")).click();

			
			
			// Create the object of the Select class
			Select se = new Select(driver.findElement(By.xpath("//*[@id=\"age_"+i+"_1\"]")));
						
			// Select the option using the visible text //*[@id="age_1_1"]
			se.selectByVisibleText(age_oneenf);
			driver.findElement(By.xpath("//*[@id=\"age_"+i+"_1\"]")).click();
			String agechil =se.getFirstSelectedOption().getText();
	 		System.out.println(agechil);

			}
			
			
			driver.findElement(By.xpath("//*[@id=\"guest\"]/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div/div[5]/button")).click();
		}

	
	@Test(priority = 5)
	 public void selectroom() throws InterruptedException
	 {
		
		Thread.sleep(5000);

		 
	      String pensioninput ="Demi Pension";
				 
		 List <WebElement> roomsel= driver.findElements(By.xpath("//*[@id=\"dynamique\"]/div[1]/article/div[2]/div/div/div/div/article/div/div[2]"));
		 
	 
		
			/* for (WebElement roomi : roomsel) {
				String arrengementroom = roomi.getText();

				if (arrengementroom.equals("Demi Pension")) {
					System.out.println(arrengementroom);

 				}

			}*/
		 
			for(int i=1; i<=roomsel.size() ; i++)
			{
		 
				
		  String pension=	driver.findElement(By.xpath("//*[@id=\"dynamique\"]/div[1]/article/div[2]/div/div/div/div/article/div/div[2]/form[4]/div/div[3]")).getText();
		  System.out.println(pension);
		  
		//*[@id="dynamique"]/div[1]/article[1]/div[2]/div/div/div/div/article/div/div[2]/form[1]/div/div[3]
		  
		  
		  //if (pension.equals("Demi Pension"))
	 
	// driver.findElement(By.xpath("//*[@id=\"dynamique\"]/div[1]/article/div[2]/div/div/div/div/article/div/div[2]/form["+i+"]/div/div[4]/button")).click();
			
			
			}
		
		 
	 }
	
}

