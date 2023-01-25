package booking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Pension extends LunchBrowser {

	@Test(priority = 5)
	public void selectroom() throws InterruptedException {

		Thread.sleep(5000);

		String pensioninput = "Demi Pension";

		List<WebElement> roomsel = driver.findElements(By.className("tr"));

		/*
		 * for (WebElement roomi : roomsel) { String arrengementroom = roomi.getText();
		 * 
		 * if (arrengementroom.equals("Demi Pension")) {
		 * System.out.println(arrengementroom);
		 * 
		 * } }
		 */			
		
		
		System.out.println(roomsel.size());


		for (int i = 0; i < roomsel.size(); i++) {

			String pension = driver.findElement(
			By.xpath("//*[@id=\"dynamique\"]/div[1]/article/div[2]/div/div/div/div/article/div/div[2]/form["+i+"]/div/div[3]")).getText();
			//System.out.println(i);

			// *[@id="dynamique"]/div[1]/article[1]/div[2]/div/div/div/div/article/div/div[2]/form[1]/div/div[3]

			// if (pension.equals("Demi Pension"))

			// driver.findElement(By.xpath("//*[@id=\"dynamique\"]/div[1]/article/div[2]/div/div/div/div/article/div/div[2]/form["+i+"]/div/div[4]/button")).click();

		}

	}
}
